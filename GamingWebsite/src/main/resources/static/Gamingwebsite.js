document.addEventListener("DOMContentLoaded", function() {
    const cards = document.querySelectorAll('.card');

    cards.forEach(card => {
        card.addEventListener('click', function() {
            // If the clicked card is already enlarged, remove the enlarged class
            if (this.classList.contains('enlarged')) {
                this.classList.remove('enlarged');
            } else {
                // Otherwise, enlarge the clicked card and reset others
                cards.forEach(c => c.classList.remove('enlarged'));
                this.classList.add('enlarged');
            }
        });
    });

    // Your existing code
    const menuLinks = document.querySelectorAll('.navbar .menu li a');
    menuLinks.forEach(link => {
        link.addEventListener('click', function() {
            menuLinks.forEach(link => link.classList.remove('active'));
            this.classList.add('active');
        });
    });

    const searchBox = document.getElementById('searchBox');
    searchBox.addEventListener('focus', function() {
        this.style.borderColor = 'crimson';
    });

    searchBox.addEventListener('blur', function() {
        this.style.borderColor = '#ccc';
    });
});

function activateSearch() {
    document.getElementById('searchBox').classList.add('search-box-clicked');
}
