function handleLogin(event)
{
	event.preventDefault(); //prevent the form to refreshing the page
	
	const uName = document.getElementById('username').value;
	const pwd = document.getElementById('password').value;
	//Fetch data from controller
	fetch('/loginsubmit', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({ username: uName, password: pwd }),
    })
    .then(response => response.json())
    .then(data => {
        document.getElementById('responseMessage').innerText = data.message;
        document.getElementById('loginId').style.display = 'none';
            })
    .catch(error => console.error('Error:', error));
}