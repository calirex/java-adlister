<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 3/10/23
  Time: 4:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Pizza Order Form</title>
</head>
<body>
<h1>Pizza Order Form</h1>
<form action="/PizzaOrder" method="POST">
    <label for="crust">Select crust type:</label>
    <select name="crust" id="crust">
        <option value="thin">Thin crust</option>
        <option value="thick">Thick crust</option>
        <option value="stuffed">Stuffed crust</option>
    </select><br><br>

    <label for="sauce">Select sauce type:</label>
    <select name="sauce" id="sauce">
        <option value="tomato">Tomato sauce</option>
        <option value="bbq">BBQ sauce</option>
        <option value="garlic">Garlic sauce</option>
    </select><br><br>

    <label for="size">Select size:</label>
    <select name="size" id="size">
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
    </select><br><br>

    <label>Toppings:</label><br>
    <input type="checkbox" name="toppings" value="pepperoni">Pepperoni<br>
    <input type="checkbox" name="toppings" value="mushrooms">Mushrooms<br>
    <input type="checkbox" name="toppings" value="onions">Onions<br>
    <input type="checkbox" name="toppings" value="sausage">Sausage<br><br>

    <label for="address">Delivery Address:</label>
    <input type="text" name="address" id="address"><br><br>

    <input type="submit" value="Submit">
</form>
</body>
</html>