document.addEventListener('DOMContentLoaded', function() {
    const bulb = document.getElementById('bulb');
    const colorButtons = document.querySelectorAll('.color-btn');

    // Event listener for changing the bulb color
    colorButtons.forEach(button => {
        button.addEventListener('click', function() {
            const color = this.id; // Get the id of the clicked button (e.g., "red", "blue")
            changeBulbColor(color);
        });
    });

    // Function to change the bulb color
    function changeBulbColor(color) {
        switch(color) {
            case 'red':
                bulb.style.backgroundColor = 'red';
                break;
            case 'blue':
                bulb.style.backgroundColor = 'blue';
                break;
            case 'warm':
                bulb.style.backgroundColor = '#FF8C00'; // warm orange
                break;
            case 'white':
                bulb.style.backgroundColor = 'white';
                break;
            case 'orange':
                bulb.style.backgroundColor = 'orange';
                break;
            default:
                bulb.style.backgroundColor = 'white';
        }
    }
});