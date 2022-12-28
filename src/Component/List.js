import './index.css';
import axios from "axios";
import React, { useEffect, useState } from "react";


const List = () => {
 const [query, setQuery] = useState("");
 const [post, setPost] = useState();

 //
 useEffect(() => {
   const fetchPosts = async () => {
     const response = await axios.get(`http://localhost:9092/api/addStudent/${query}`);
     setPost(response.data);

   };
   const fetchInitialPosts = async () => {
       const response = await axios.get(`http://localhost:9092/api/listStudents`);
       console.log(response);
       setPost(response.data);
   }
   if (query.length === 0) fetchInitialPosts();
   if (query.length > 2) fetchPosts();
 }, [query]);
console.log(post);
 return (

  
   
     <>
     <div class="head">
  
  <h1>Student Management</h1>
 </div> <br></br> <br></br> <br></br> <br></br> <br></br><br></br><br></br><div class="buttonhome"><button sx={{ margin: "1% 2%" }} variant="outlined">
   <a href="/student/add">Add Student</a>
  </button><br></br></div>
  <br></br><table class="table">
    <thead>


     {/* <th>Id</th> */}
    
     <th>AdmissionNum</th>
     <th>Name </th>
     <th> Dob</th>
     <th> ClassName</th>
     <th> DivisionName</th>
     <th> Gender</th>
    
    </thead>


    {post &&
     post.map((p) => {
      return (

       <tbody key={p.id}>
       <tr>
         <td>
          {p.admissionNum}
         </td>

         <td> {p.name}</td>


         <td> {p.dob}</td>
         <td> {p.className}</td>
         <td> {p.divisionName}</td>
         <td> {p.gender}</td>

        </tr>
       </tbody>

      );
     })}

   </table></>
  
   
 );
};

export default List;
