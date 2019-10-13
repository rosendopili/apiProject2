/*LOGIN FUNCTIONALITY*/
function logIn(event) {
  document.querySelector('.signupBar').style.display = "none";
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
      .then((res) => {
    createPost();
    })
      .then((res)=>{
    deletePost();
    })
    .then((res)=>{
    profile();
    })
    .then((res)=>{
    console.log(res.token);
    })
      .catch((err) => {
    console.log(err);
    })
}

/*SIGNUP functionality*/

function signUp(event) {
  document.querySelector('.signupBar').style.display = "none";
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
        localStorage.setItem('user', + res.token);
    })
    .catch((err) => {
        console.log(err);
    })
}

//ADDING PROFILE UPDATE FUNCTIONALITY//

function profile(event) {
    document.querySelector('.userContainer').style.display = "none";
    event.preventDefault();
    const bio = document.querySelector('.bio');
    const location = document.querySelector('.location');
    const mobile = document.querySelector('.mobile');

    fetch('http://localhost:8080/profile/{username}', {
            method: 'POST',
            headers: {
              "Authorization": "Bearer " + localStorage.getItem('user'),
              "Content-Type": "application/json"
            },
            body: JSON.stringify({
                bio: bio.value,
                location: location.value,
                mobile: mobile.value
            })
    })
    .then((res) => {
    return res.json();
    })
    .catch((err) => {
        console.log(err);
    })
}

//CREATE A POST FUNCTIONALITY//

function createPost(event) {
    event.preventDefault();
    const title = document.querySelector('.title');
    const body = document.querySelector('.body');

    fetch("http://localhost:8080/{username}/post", {
        method: 'POST',
        headers: {
            "Authorization": "Bearer " + localStorage.getItem('user'),
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            title: title.value,
            body: body.value
        })
    })
    .then((res) => {
        console.log(res);
        updateDom(res);
    })
    .catch((err) => {
        console.log(err);
    })
}

//UPDATING DOM TO CREATE CONTENT WALL//

function updateDom() {
  document.querySelector('.allPosts').style.display = "block";
  document.querySelector('.allPosts');

          for (let i = 0; i < res.length; i++) {

            const item = document.createElement('li');
            const title = document.createElement('h3');
            const body = document.createElement('p');
            const commentInput =
            document.createElement('input');
            const buttonDelete = document.createElement('input');

            item.appendChild(title);
            item.appendChild(body);
            //added comment button to the array//
            commentInput.appendChild(item);
            //added delete button to the array//
            buttonDelete.appendChild(item);

            title.innerText = res[i].title;
            body.innerText = res[i].body;

            list.appendChild(item);
            list.appendChild(commentInput);
            list.appendChild(buttonDelete);

            commentInput.setAttribute("class", "comment");
            commentInput.setAttribute("type", "submit");
            commentInput.setAttribute("value", "comment");
            commentInput.setAttribute("onclick", "createComment(event)");

            buttonDelete.setAttribute("class", "delete");
            buttonDelete.setAttribute("type", "submit");
            buttonDelete.setAttribute("value", "delete");
            buttonDelete.setAttribute("onclick", "deletePost(event)");

            description.setAttribute("class", "wallPost");
          }

}


//ADDING LIST POSTS FUNCTIONALITY//
function listAllPosts(event) {
    const posts = document.querySelector('.allPosts');

    fetch("http://localhost/{username}/post/list", {
            method: "GET",
            headers: {
              "Content-Type": "application/json",
            },
    })
    .then((res) => {
        return res.json();
    })
    .then((res) => {
        updateDom();
    })
    .catch((err) => {
        console.log(err);
    })
}

listAllPosts(); //calling function to initiate listAllPosts//


//CREATE COMMENT FUNCTIONALITY//
function createComment(event) {
  event.preventDefault();
  fetch("http://localhost:8080/{username}/{postId}/comment", {
      method: 'POST',
      headers: {
          "Authorization": "Bearer " + localStorage.getItem('user'),
          "Content-Type": "application/json"
      },
      body: JSON.stringify({
          title: title.value,
          body: body.value
      })
  })
  .then((res) => {
      console.log(res);
  })
    .then((res) => {
        const commentList =
        document.querySelector('.comment');
        for (let i = 0; i < res.length; i++) {
          const commentItem = document.createElement('div');
          const commentTitle = document.createElement('h3');
          const commentBody = document.createElement('p');
          const commentDelete = document.createElement('input');

          commentTitle.innerText = res[i].commentTitle;
          commentBody.innerText = res[i].commentBody;
          commentItem.appendChild(commentTitle);
          commentItem.appendChild(commentBody);

          commentDelete.setAttribute("class", "delete");
          commentDelete.setAttribute("type", "submit");
          commentDelete.setAttribute("value", "deleteComment");
          commentDelete.setAttribute("onclick", "deleteComment(event)");
        }
      })
        .catch((err) => {
            console.log(err);
      })
    }

//DELETE POST FUNCTIONALITY//

function deletePost(event) {
  event.preventDefault();
  document.querySelector(".deletePost");

  fetch('http://localhost:8080/{username}/post/delete/{postId}', {
      method: "DELETE",
      headers: {
          "Authorization": "Bearer" +
          localStorage.getItem('user'),
          "Content-Type": "application/json"
        },
      })
      .then((res) => {
          console.log(res);
      })
      .catch((err) => {
          console.log(err);
      })
      .then((res) => {

      })
}

//DELETE COMMENT FUNCTIONALITY//

function deleteComment(event) {
  event.preventDefault();
  document.querySelector(".deleteComment");

  fetch('http://localhost:8080/{username}/comment/delete/{commentId}', {
      method: "DELETE",
      headers: {
          "Authorization": "Bearer" +
          localStorage.getItem('user'),
          "Content-Type": "application/json"
        },
      })
      .then((res) => {
          console.log(res);
      })
      .catch((err) => {
          console.log(err);
      })
      .then((res) => {
      })
}
