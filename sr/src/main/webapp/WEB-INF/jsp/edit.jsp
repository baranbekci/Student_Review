<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container">

<h3>Student Registration</h3>
<form action='/index/update' method='post'>
 
    <table class='table table-hover table-responsive table-bordered'>
 
        <tr>
            <td><b>Name</b></td>
            <td><input type='text' name='name' class='form-control' value="${student.name}" /></td>
        </tr>
 
        <tr>
            <td><b>Surname</b></td>
            <td><input type='text' name='surname' class='form-control' value="${student.surname}" /></td>
        </tr>
 
        <tr>
            <td><b>Phone</b></td>
            <td><input type='text' name='phone' class='form-control' size="20" value="${student.phone}" /></td>
            
        </tr>

        <tr>
            <td><b>City</b></td>
            <td><input type='text' name='city' class='form-control' size="20" value="${student.city}" /></td>

        </tr>

        <tr>
            <td><b>Adress</b></td>
            <td><input type='text' name='district' class='form-control' size="20" value="${student.district}" /></td>

        </tr>

        <tr>
            <td><b>Adress</b></td>
            <td><input type='text' name='description' class='form-control' size="20" value="${student.description}" /></td>

        </tr>
 
 			<input type='hidden' id='id' rows='5' class='form-control' name='id' value="${student.id}"/>
        <tr>
            <td></td>
            <td>
                <button type="submit" class="btn btn-primary">Update Student Information</button>
            </td>
        </tr>
 
    </table>
</form>


</div>

