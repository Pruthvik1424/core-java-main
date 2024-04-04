<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="ipl.js"></script>
<title>Indian premier league</title>
</head>

<nav class="navbar navbar-dark bg-dark">
<h3 style="color:white">INDIAN PREMIER LEAGUE</h3>
<ul class="nav justify-content-end">
  <!-- <li class="nav-item">
    <a class="nav-link active" aria-current="page" href="#">Active</a>
  </li> -->
  <li class="nav-item">
    <a class="nav-link" href="index.jsp">Home</a>
  </li>
  <!-- <li class="nav-item">
    <a class="nav-link" href="#">Link</a>
  </li> -->
  <!-- <li class="nav-item">
    <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
  </li> -->
</ul>
</nav>

<body>

<div class="container mt-5 mb-5 d-flex justify-content-center"  >

	<div class="card p-4 ">
		<div class="card-body">
		<nav class="navbar navbar-dark bg-dark">
<h3 style="color:white" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;INDIAN PREMIER LEAGUE</h3>
</nav>
		
		
<form class="row g-3" action="iplmatch" method="post">
  <div class="col-12" >
    <label for="matchno" class="form-label">Match Number</label>
    <span id="matchnoError"></span>
    <input type="number" class="form-control" id="matchno" name="matchno" required>
  </div>
<div>  
  <div class="col-md-3">
    <label for="inputState" class="form-label">Fixture</label>
    <select id="inputState" class="form-select" name="fixture" required>
      <option selected value="" disabled>--Select team--</option>
      <option value="RCB">RCB</option>
      <option value="CSK">CSK</option>
      <option value="KKR">KKR</option>
      <option value="LSG">LSG</option>
      <option value="MI">MI</option>
      <option value="PBKS">PBKS</option>
      <option value="SRH">SRH</option>
    </select>
  </div>
  V/S
  <div class="col-md-3">
   <!--  <label for="inputState" class="form-label">Team</label> -->
    <select id="inputState" class="form-select" name="fixture" required>
      <option selected value="" disabled>--Select team--</option>
      <option value="RCB">RCB</option>
      <option value="CSK">CSK</option>
      <option value="KKR">KKR</option>
      <option value="LSG">LSG</option>
      <option value="MI">MI</option>
      <option value="PBKS">PBKS</option>
      <option value="SRH">SRH</option>
    </select>
  </div>
  </div>
  
  
  <div class="col-md-6">
    <label for="inputEmail4" class="form-label">On Field Umpire</label>
    <input type="text" class="form-control" name="onfieldumpire" id="inputEmail4" required>
  </div>
  
   <div class="col-md-6">
    <label for="inputEmail4" class="form-label">On Field Leg Umpire</label>
    <input type="text" class="form-control" id="inputEmail4" name="onfieldlegumpire" required>
    </div>
  
  <div class="col-md-12">
    <label for="inputEmail4" class="form-label">Third Umpire</label>
    <input type="text" class="form-control" id="inputEmail4" name="thirdumpire" required>
    </div>
    
    
   
    
  
  
  <div class="col-md-6">
    <label for="inputPassword4" class="form-label">Date</label>
    <input type="Date" class="form-control" id="inputPassword4" name="date">
  </div>
  
  <div class="col-md-6">
    <label for="inputPassword4" class="form-label">Time</label>
    <input type="time" class="form-control" id="inputPassword4" name="time">
  </div>
  
  
  
    
 
  <div class="col-md-12">
    <label for="inputState" class="form-label">Venue</label>
    <select id="inputState" class="form-select" name="venue">
      <option selected disabled>--Select Venue--</option>
      <option value="Chennai">	MA Chidambaram Stadium, Chennai</option>
      <option value="Chandigarh">Maharaja Yadavindra Singh International Cricket Stadium, Mullanpur, Chandigarh</option>
      <option value="kolkata">Eden Gardens, Kolkata</option>
      <option value="Ahamadabad">Narendra Modi Stadium, Ahamadabad</option>
      <option value="Bengaluru">M. Chinnaswamy Stadium, Bengaluru</option>
      <option value="NaviMumbai">DY Patil Stadium,NaviMumbai</option>
      <option value="mumbai">Wankhede Stadium, mumbai</option>
      <option value="Delhi">Arun Jaitley Stadium,Delhi</option>
    </select>
  </div>
  
  <div class="col-12">
    <label for="inputAddress2" class="form-label">Stadium Capacity</label>
    <input type="text" class="form-control" id="inputAddress2" name="capacity" placeholder="Enter stadium capacity">
  </div>
  
  
  
  <div class="col-md-12">
    <label for="inputState" class="form-label">Home Ground For</label>
    <select id="inputState" name="homeground" class="form-select">
      <option selected value="" disabled>--Select team--</option>
      <option value="RCB">RCB</option>
      <option value="CSK">CSK</option>
      <option value="KKR">KKR</option>
      <option value="LSG">LSG</option>
      <option value="MI">MI</option>
      <option value="PBKS">PBKS</option>
      <option value="SRH">SRH</option>
    </select>
  </div>
  
   <fieldset class="row mb-3">
    <label class="col-form-label col-sm-2 pt-0">Stadium type</label>
    <div class="col-sm-10">
      <div class="form-check">
        <input class="form-check-input" type="radio"  name="type" id="gridRadios1" value="option1" >
        <label class="form-check-label" for="gridRadios1">
          Day
        </label>
      </div>
      <div class="form-check">
        <input class="form-check-input" type="radio" name="type" id="gridRadios2" value="option2">
        <label class="form-check-label" for="gridRadios2">
          Night
        </label>
      </div>
      <div class="form-check disabled">
        <input class="form-check-input" type="radio" name="type" id="gridRadios3" value="option3" disabled>
        <label class="form-check-label" for="gridRadios3">
          Day/Night
        </label>
      </div>
    </div>
    </fieldset>
  
  
  
  
 
  <div class="col-12">
    <div class="form-check">
      <input class="form-check-input" type="checkbox" id="gridCheck"  name="checkbox"required>
      <label class="form-check-label" for="gridCheck">
        Accept 
      </label>
    </div>
  </div>
  <div class="col-12">
    <button type="submit" onclick="submit()" class="btn btn-primary">Submit</button>
  </div>
</form>
		
		</div>
	</div>
</div>
</body>

</html>