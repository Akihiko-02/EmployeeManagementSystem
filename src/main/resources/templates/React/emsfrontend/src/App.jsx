import './App.css'
import EmployeeComponenet from './component/EmployeeComponenet'
import FooterComponent from './component/FooterComponent'
import HeaderComponent from './component/HeaderComponent'
import ListEmployeeComponent from './component/ListEmployeeComponent'
import 'bootstrap/dist/css/bootstrap.min.css'
import { BrowserRouter, Routes, Route } from 'react-router-dom'

function App() {
  return (
    <>
    <BrowserRouter>
    <HeaderComponent />
    <Routes>
      
      <Route path='/' element={<ListEmployeeComponent />}></Route>
      <Route path='/employees' element = {<ListEmployeeComponent />}></Route>
      <Route path='/add-employee' element={<EmployeeComponenet />}></Route>
      <Route path='/edit-employee/:id' element={<EmployeeComponenet />}></Route>
    </Routes>
    <FooterComponent />
    </BrowserRouter>
    
    </>
  )
}

export default App
