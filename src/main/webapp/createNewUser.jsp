<%-- 
    Document   : createNewUser
    Created on : Jul 12, 2023, 6:00:46 PM
    Author     : cardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/head.jsp"%>
<%@include file="components/mainBody.jsp"%>

<h1>User registration </h1>
<p>User registration for Ger's garage </p>

<form class="user" action="SvUsers" method="POST">
        <div class="form-group">
            <input type="text" class="form-control form-control-user"
                    id="exampleInputFirstName" name="exampleInputFirstName" aria-describedby="firstName"
                placeholder="First name">
        </div>
        <div class="form-group">
            <input type="text" class="form-control form-control-user"
                   id="exampleInputLastName" name="InputLastName" aria-describedby="lastName"
                placeholder="Last name">
        </div>
        <div class="form-group">
            <input type="email" class="form-control form-control-user"
                id="exampleInputEmail" name="exampleInputEmail" aria-describedby="emailHelp"
                placeholder="Enter Email Address...">
        </div>
        <div class="form-group">
            <input type="password" class="form-control form-control-user"
                   id="exampleInputPassword" name="exampleInputPassword" placeholder="Password">
        </div>
        <div class="form-group">
            <div class="custom-control custom-checkbox small">
                <input type="checkbox" class="custom-control-input" id="customCheck">
                <label class="custom-control-label" for="customCheck">Remember
                    Me</label>
            </div>
        </div>
        <a href="index.html" class="btn btn-primary btn-user btn-block">
            Login
        </a>
         <button class="btn btn-primary btn-user btn-block" type="submit">
            Register user
        </button>
    
        
    </form>

<%@include file="components/lastBody.jsp"%>
