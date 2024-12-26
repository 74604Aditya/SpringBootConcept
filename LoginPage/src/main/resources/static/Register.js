function handleRegister(event) {
    event.preventDefault(); // Prevent the form from refreshing the page
    
    const firstName = document.getElementById('firstname').value;
    const lastName = document.getElementById('lastname').value;
    const uName = document.getElementById('username').value;
    const pwd = document.getElementById('password').value;
    const confirmPwd = document.getElementById('confirmpassword').value;
    const email = document.getElementById('email').value;
    const phone = document.getElementById('phone').value;
    
    if (pwd !== confirmPwd) {
        alert("Passwords do not match");
        return;
    }
    
    if (firstName && lastName && uName && pwd && email && phone) {
        alert("Successfully Registered");
        // Here you can add code to send the data to your backend server
    } else {
        alert("Please fill in all fields");
    }
}
