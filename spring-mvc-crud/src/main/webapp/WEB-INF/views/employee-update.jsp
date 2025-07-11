<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Form</title>
    <style>
        .form-container { width: 50%; margin: 20px auto; }
        .form-group { margin-bottom: 15px; }
        label { display: inline-block; width: 100px; }
        input[type="text"], input[type="email"] { width: 200px; padding: 5px; }
        .submit-btn { margin-left: 100px; }
    </style>
</head>
<body>
    <h2 style="text-align: center;">${employee.id == null ? 'Add Employee' : 'Edit Employee'}</h2>
    <div class="form-container">
        <form:form action="edit" modelAttribute="employee" method="post">
            <form:hidden path="id"/>
            <div class="form-group">
                <label>Name:</label>
                <form:input path="name" required="true"/>
            </div>
            <div class="form-group">
                <label>Email:</label>
                <form:input path="email" type="email" required="true"/>
            </div>
            <div class="form-group">
                <label>Department:</label>
                <form:input path="department" required="true"/>
            </div>
            <div class="form-group">
                <input type="submit" value="Save" class="submit-btn"/>
            </div>
        </form:form>
    </div>
</body>
</html>
