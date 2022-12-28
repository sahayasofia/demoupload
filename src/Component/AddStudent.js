import React, { useState } from "react";
import './index.css';

import { useNavigate } from "react-router-dom";
const initial = {  name: "", className: "", divisionName:"",gender:"", dob:"" };
// const initial = { profile: "", exp: 0, techs: [], desc:"" };


const AddStudent = () => {
    
  const navigate = useNavigate();
  const [form, setForm] = useState(initial);

  const handleSubmit = (e) => {
    e.preventDefault();
    fetch("http://localhost:9092/api/addStudent", {
      method: "POST", // or 'PUT'
      headers: {
        "Content-Type": "application/json",
      },
      
      body: JSON.stringify(form),
    })
      .then((response) => console.log(response))
      .then((data) => {
        console.log("Success:", data);
      })
      .catch((error) => {
        console.error("Error:", error);
      });
      navigate('/');
  };

  const { name, divisionName, dob ,className} = form;

  const handleChange = (e) => {
    setForm({...form });
  }

  return (
    <>
    <body>
      
 <br></br><br></br><br></br><br></br>
 
   <button type ="submit">
       <a href="/">
        <h2>Back</h2>
       </a>
      </button>
    
      
<div id="fix-bar"><div  class="content">
 
        <div align="center" variant="h5"class="content">
          Create New Post
        </div>
        <form autoComplete="off"  onSubmit={handleSubmit}>
          <box ><br></br><br></br><br></br>
              <b>Student name</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input  type="text"  id="name" onChange={(e) => setForm({ ...form, name: e.target.value })}
 
              placeholder=" Enter Student Name" value={name} pattern="[a-z A-Z]{3,13}" title="Student Name must be more than two Character and only letters" required/><br></br><br></br>
       
      <b>Class Name</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
           
           <select name="className"  placeholder=" Enter Class Name" value={className}  onChange={(e) => setForm({ ...form, className:e.target.value})}title="Select ClassName"  required>

           <option id="20" ></option>
         <option id="0" >I</option>
         <option id="1" >II</option>
         <option id="2" >III</option>
         <option id="3" >IV</option>
         <option id="4" >V</option>  
         <option id="5" >VI</option>
         <option id="7" >VII</option>
         <option id="8" >VIII</option>
         <option id="9" >IX</option>
         <option id="10" >X</option>
         <option id="11" >XI</option>
         <option id="12" >XII</option>
     </select><br></br><br></br>
           
              <b>Division Name</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
           
              <select name="divisionName"placeholder=" Enter Division Name" value={divisionName}  onChange={(e) => setForm({ ...form, divisionName:e.target.value})} title="Select divisionName"  required>
              <option id="4" ></option>
            <option id="0" >A</option>
            <option id="1" >B</option>
            <option id="2" >C</option>
        </select>
        <br></br><br></br>
              {/* <b>Gender</b>
            <br></br> 
            <input  type="radio" name="gender" id="radio" title="Select the Gender"  onChange={(e) => setForm({ ...form, gender:"Male" })} reqiured/><b>Male</b>&nbsp;&nbsp;&nbsp;

              <input type="radio" name="gender" id="radio" onChange={(e) => setForm({ ...form, gender:"Female" })}/><b>Female</b>
              
              <input type="radio" name="gender" id="radio" onChange={(e) => setForm({ ...form, gender:"Other" })} /><b>Other</b>&nbsp;&nbsp;&nbsp; <br></br><br></br><br></br> */}

<b>Gender</b>
           <center>
            <div class="form-check form-check-inline">
            <input class="form-check-input" type="radio" name="gender" id="inlineRadio1" value="male"
            required onChange={(e) => setForm({ ...form, gender:"Male" })} />
            <label class="form-check-label" for="inlineRadio1">Male</label>
            </div>

             <div class="form-check form-check-inline">
             &nbsp;&nbsp;&nbsp;&nbsp; <input class="form-check-input" type="radio" name="gender" id="inlineRadio2" value="female"
            required onChange={(e) => setForm({ ...form, gender:"Female" })} />
            <label class="form-check-label" for="inlineRadio2">Female</label>
            </div>

            <div class="form-check form-check-inline">
            &nbsp;&nbsp; <input class="form-check-input" type="radio" name="gender" id="inlineRadio2" value="others"
            required onChange={(e) => setForm({ ...form, gender:"Other" })}  />
            <label class="form-check-label" for="inlineRadio2">Other</label>
            </div>
            </center><br></br>

              <b>DOB</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input type="date"  onChange={(e) => setForm({ ...form, dob: e.target.value })} value={dob} min ="2004-06-06" max="2024-06-06" required/>
           <br></br><br></br>
          
            <input type="submit"/>
            
            <input type="reset" name="reset" value="Cancel" onclick="myFunction()"></input>
          </box>
        </form>
      </div></div>
      </body>
      </>
  );
};

export default AddStudent;
