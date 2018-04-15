<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<h3>Student Registration</h3>
<br>
<form action='/index/add' method='post'>
 
    <table class='table table-hover table-responsive table-bordered'>
 
        <tr>
            <td><b>Name</b></td> 
            <td><input type='text' name='name' class='form-control'  required/></td>
        </tr>
 
        <tr>
            <td><b>Surname</b></td>
            <td><input type='text' name='surname' class='form-control' required /></td>
        </tr>
 
        <tr>
            <td><b>Phone</b></td>
            <td><input type='text' name='phone' class='form-control' size="20" required/></td>
            
        </tr>

        <tr>
            <td><b>City</b></td>
            <td><input type='text' name='city' class='form-control' size="20" required/></td>

        </tr>

        <tr>
            <td><b>District</b></td>
            <td><input type='text' name='district' class='form-control' size="20" required/></td>

        </tr>

        <tr>
            <td><b>Description</b></td>
            <td><input type='text' name='description' class='form-control' size="20" required/></td>

        </tr>
 
 
        <tr>
            <td></td>
            <td>
                <button type="submit" class="btn btn-primary">Register</button>
            </td>
        </tr>
 
    </table>
    <b><c:out value="${danger}"></c:out></b>
</form>



<h3>List Of Student</h3>
<br>
<table class="table table-hover">

    <thead>
      <tr>
          <th><b>Student Name</b></th>
          <th><b>Student Surname</b></th>
          <th><b>Student Phone</b></th>
          <th><b>Student City</b></th>
          <th><b>Student District</b></th>
          <th><b>Student Description</b></th>

          <th><b>Transactions</b></th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="los">
      <tr>
          <td><c:out value="${los.name}"></c:out></td>
          <td><c:out value="${los.surname}"></c:out></td>
          <td><c:out value="${los.phone}"></c:out></td>
          <td><c:out value="${los.city}"></c:out></td>
          <td><c:out value="${los.district}"></c:out></td>
          <td><c:out value="${los.description}"></c:out></td>

			 <td>
             <a href="/index/${los.id}/edit">
                <button type="submit" class="btn btn-primary">Edit Student</button>
                </a>
            </td>
            <td>
             <a href="/index/${los.id}/delete">
                <button type="submit" class="btn btn-primary">Delete Student</button>
                </a>
            </td>
      </tr>

          </c:forEach>
    </tbody>
  </table>


