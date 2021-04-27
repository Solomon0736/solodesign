var express = require('express');
var router = express.Router();

/* GET login listing. */
router.get('/', function(req, res, next) {
  res.render('login', {title: 'Schoolsoft'});
});

router.post('/', function(req, res, next) {
   console.log(req.body);

  const username = req.body.username;
  const password = req.body.password;

  if (password == "Secret123") {

    req.session.loggedin = true;
    req.session.username = username;
    res.redirect('/topsecret');
    
  } else {

    res.render(
      'login',
      {
        title: 'Schoolsoft',
        error: 'FEL!'
      }
    )};
  
});


 


module.exports = router;
