<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Flames Calculator</title>
<style>

* {
  margin: 0;
  padding: 0;
  font-family: sans-serif;
}

.login {
  padding: 15px;
  width: 400px;
  margin: 2% auto 0 auto;
  text-align: center;
  margin-top: 1%;
}
    h2 {
      font-size: 3em;
      font-weight: 300;
      color: black;
      display: inline-block;
      padding-bottom: 5px;
    }

 
    .form-control {
    background-color: white;
      padding: 10px;
      font-size: 1.6em;
      width: 100%;
      color: black;
    }

    .float {
      margin-top: 20px;
      border: 1px solid black;
      font-size: 1.6em;
      font-weight: 300;
      padding: 5px 0;
      width: 100%;
      border-radius: 3px;
      background-color: #56baed;
    }
  
</style> 
</head>
<body>
	<div class="login">
    <h2>FLAMES</h2><br>
    <form method="post" action="FlamesController">

      <div class="input-group">
        <input type="text" class="form-control" placeholder="Your Name" name="your">
          </div>

        <div class="input-group">
          <input type="text" class="form-control" placeholder="Your Crush's Name" name="crush">
        </div>

        <button type="submit" class="float">Check your Relationship status</button>
  </form>
 </div>
</body>
</html>