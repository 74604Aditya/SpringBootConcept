function handleAccount(event) {
    event.preventDefault();
    
    const fname = document.getElementById('firstname').value;
    const lname = document.getElementById('lastname').value;
    const age = document.getElementById('age').value;
    const email = document.getElementById('email').value;
    const phone = document.getElementById('phone').value;
    const password = document.getElementById('password').value;
    
    fetch('/accountdata', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({
            firstname: fname,
            lastname: lname,
            age: age,
            email: email,
            phone: phone,
            password: password,
        })
    })
    .then(response => response.json())
    .then(data => {
        document.getElementById('accountId').style.display = 'none';
        document.getElementById('responseMessage').innerText = data.rmsg;
    })
    .catch(error => console.error('Error:', error));
}
