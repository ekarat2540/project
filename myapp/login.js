function signIn(){
  var email = document.getElementById('email').value;
  var password = document.getElementById('password').value;
  firebase.auth().signInWithEmailAndPassword(email, password).catch(function (error){
      var errorCode = error.code;
      var errorMessage = error.message;
      if(errorMessage === 'auth/wrong-password'){
          alert('Wrong password');
      }else{
          alert(errorMessage);
          location.replace("newPerson.html")
      }
      console.log(error);
  });
  

}

