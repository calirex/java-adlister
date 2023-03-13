<%--
  Created by IntelliJ IDEA.
  User: fernandorivera
  Date: 3/13/23
  Time: 9:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Guess</title>
</head>
<body>
<h1>Guess a number between 1 and 3:</h1>
<form method="post" action="/guess">
  <input type="number" name="guess" min="1" max="3" required>
  <input type="submit" value="Submit">
  <button>Submit Number</button>
</form>
</body>
</html>

