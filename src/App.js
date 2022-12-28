
import './App.css';
// import {Dashboard} from "./Files"
// import {Create} from "./Files"
// import {Home} from "./Files"
import {List} from "./Component"
import {AddStudent} from "./Component"




import { BrowserRouter, Routes, Route } from "react-router-dom";


function App() {
  return (
    <BrowserRouter>
      <Routes>
          {/* <Route path="/student/add" element={<Home />} /> */}
          {/* <Route path="/student/create" element={<Create />} /> */}
          {/* <Route path="/student/dashboard" element={<Dashboard />} /> */}
          <Route path="/" element={<List />} />
          <Route path="/student/add" element={< AddStudent />} />
          
         
      </Routes>
    </BrowserRouter>
  );
}

export default App;
