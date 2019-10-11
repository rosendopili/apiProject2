/*LOGIN FUNCTIONALITY*/
function logIn(event) {

    event.preventDefault();
    const email = document.querySelector('.email');
    const password = document.querySelector('.pw');
    const username = document.querySelector('.username');

    fetch('http://localhost:8080/login', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                email: email.value,
                password: password.value,
                username: username.value
            })
    })
    .then((res) => {
        return res.json();
    })
    .then((res) => {
        localStorage.setItem('user', res.token);
    })
    .catch((err) => {
        console.log(err);
    })
}

/*SIGNUP functionality*/

function signUp(event) {

    event.preventDefault();
    const email = document.querySelector('.email');
    const password = document.querySelector('.pw');
    const username = document.querySelector('.username');

    fetch('http://localhost:8080/signup', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                email: email.value,
                password: password.value,
                username: username.value
            })
    })
    .then((res) => {
        return res.json();
    })
    .then((res) => {
        localStorage.setItem('user', res.token);
    })
    .catch((err) => {
        console.log(err);
    })
}

function profile(event) {

    event.preventDefault();
    const bio = document.querySelector('.bio');
    const location = document.querySelector('.location');
    const mobile = document.querySelector('.mobile');

    fetch('http://localhost:8080/profile/{username}', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                bio: bio.value,
                location: location.value,
                mobile: mobile.value
            })
    })
    .then((res) => {
        localStorage.setItem('user');
    })
    .catch((err) => {
        console.log(err);
    })
}
