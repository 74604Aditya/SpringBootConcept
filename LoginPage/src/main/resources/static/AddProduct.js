// src/main/resources/static/AddProducts.js
function handleAddProducts(event) {
    event.preventDefault(); // Prevent form refresh

    const products = [];
    const productItems = document.querySelectorAll('.product-item');

    productItems.forEach((item, index) => {
        const productName = item.querySelector(`input[name="productName"]`).value;
        const productPrice = item.querySelector(`input[name="productPrice"]`).value;
        const productDescription = item.querySelector(`textarea[name="productDescription"]`).value;

        products.push({
            name: productName,
            price: productPrice,
            description: productDescription
        });
    });

    fetch('/addproduct', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({ products: products }),
    })
    .then(response => response.json())
    .then(data => {
        document.getElementById('responseMessage').innerText = data.message;

        if (data.success) {
            document.getElementById('addProductsForm').reset();
        }
    })
    .catch(error => {
        console.error('Error:', error);
        document.getElementById('responseMessage').innerText = 'An error occurred while adding the products.';
    });
}

function addProductField() {
    const productFields = document.getElementById('productFields');
    const productCount = productFields.querySelectorAll('.product-item').length + 1;

    const productItem = document.createElement('div');
    productItem.classList.add('product-item');

    productItem.innerHTML = `
        <label for="productName${productCount}">Product Name</label>
        <input type="text" id="productName${productCount}" name="productName" required>

        <label for="productPrice${productCount}">Price</label>
        <input type="number" id="productPrice${productCount}" name="productPrice" required>

        <label for="productDescription${productCount}">Description</label>
        <textarea id="productDescription${productCount}" name="productDescription" required></textarea>
    `;

    productFields.appendChild(productItem);
}
