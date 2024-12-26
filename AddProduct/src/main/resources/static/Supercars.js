<script>
    document.addEventListener('DOMContentLoaded', function() {
        const exploreButtons = document.querySelectorAll('.explore-btn');
        const carDetails = document.querySelectorAll('.car-details');
        
        // Hide all car details initially
        carDetails.forEach(detail => {
            detail.style.display = 'none';
        });

        exploreButtons.forEach((button, index) => {
            button.addEventListener('click', function() {
                // Toggle visibility of car details when the button is clicked
                const details = carDetails[index];
                if (details.style.display === 'none' || details.style.display === '') {
                    details.style.display = 'block';  // Show car details
                } else {
                    details.style.display = 'none';  // Hide car details
                }
            });
        });

        // Handle hover effect for showing more details dynamically
        const cards = document.querySelectorAll('.card');
        
        cards.forEach(card => {
            card.addEventListener('mouseenter', () => {
                card.style.transform = 'scale(1.05)';
            });

            card.addEventListener('mouseleave', () => {
                card.style.transform = 'scale(1)';
            });
        });
    });
</script>
