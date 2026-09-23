import React, { useEffect, useState } from 'react'
import { createEmployee, getEmployee, updateEmployee } from '../services/EmployeeService'
import { useNavigate, useParams } from 'react-router-dom'

const EmployeeComponenet = () => {

  const [firstName, setFirstName] = useState('')
  const [lastName, setLastName] = useState('')
  const [email, setEmail] = useState('')

  const {id} = useParams();

  const navigate = useNavigate();
  const [errors, setErrors] = useState({
    firstName: '',
    lastName: '',
    email: ''
  })

  
  const handleFirstName = (e) => setFirstName(e.target.value);
  const handleLastName = (e) => setLastName(e.target.value);
  const handleEmail = (e) => setEmail(e.target.value);

 useEffect(()=>{
  if(id){
    console.log("ID =", id);
    console.log("getEmployee =", getEmployee);

    const result = getEmployee(id);

    console.log("result =", result);

    result.then((response)=>{
      setFirstName(response.data.firstName);
      setLastName(response.data.lastName);
      setEmail(response.data.email);
    }).catch(error =>{
      console.error(error);
    })
  }
},[id])

  function saveUpdateEmployee(e) {  
    e.preventDefault();

    if (validateForm()) {
      const employee = { firstName, lastName, email };
      console.log(employee);
      if(id){
        updateEmployee(id,employee).then((response)=>{
          console.log(response.data);
          navigate('/employees');
        }).catch(error=>{
          console.error(error);
        })
      }else{
        createEmployee(employee).then((response) => {
        console.log(response.data);
        navigate('/employees');
      }).catch(error=>{
        console.error(error);
      })
      }
      
    }
  }

  function validateForm() {
    let valid = true;
    const errorCopy = { ...errors }

    if (firstName.trim()) {
      errorCopy.firstName = '';
    } else {
      errorCopy.firstName = 'First name is required';
      valid = false;
    }

    if (lastName.trim()) {
      errorCopy.lastName = '';
    } else {
      errorCopy.lastName = 'Last name is required';
      valid = false;
    }

    if (email.trim()) {
      errorCopy.email = '';
    } else {
      errorCopy.email = 'Email is required';
      valid = false;
    }

    setErrors(errorCopy);
    return valid;
  }

  function pageTitle(){
    if(id){
      return <div className="h2 text-center">Update Employee</div>
    }
    else{
      return <div className="h2 text-center">Add Employee</div>
    }
  }

  return (
    <div className="container">
      <div className="row">
        <div className="card col-md-6 offset-md-3">
          {
            pageTitle()
          }

          <div className="card-body">
            <form>

              <div className="form-group mb-2">
                <label className="form-label">
                  Employee First Name:
                </label>

                <input
                  type="text"
                  name="firstName"
                  placeholder="Enter employee first name"
                  value={firstName}
                  className={`form-control ${errors.firstName ? 'is-invalid' : ''}`}
                  onChange={handleFirstName}
                />

                {errors.firstName &&
                  <div className="invalid-feedback">
                    {errors.firstName}
                  </div>
                }
              </div>

              <div className="form-group mb-2">
                <label className="form-label">
                  Employee Last Name:
                </label>

                <input
                  type="text"
                  name="lastName"
                  placeholder="Enter employee last name"
                  value={lastName}
                  className={`form-control ${errors.lastName ? 'is-invalid' : ''}`}
                  onChange={handleLastName}
                />

                {errors.lastName &&
                  <div className="invalid-feedback">
                    {errors.lastName}
                  </div>
                }
              </div>

              <div className="form-group mb-2">
                <label className="form-label">
                  Employee Email:
                </label>

                <input
                  type="email"
                  name="email"
                  placeholder="Enter employee email"
                  value={email}
                  className={`form-control ${errors.email ? 'is-invalid' : ''}`}
                  onChange={handleEmail}
                />

                {errors.email &&
                  <div className="invalid-feedback">
                    {errors.email}
                  </div>
                }
              </div>

              <button
                onClick={saveUpdateEmployee}
                className="btn btn-success"
              >
                Submit
              </button>

            </form>
          </div>
        </div>
      </div>
    </div>
  )
}

export default EmployeeComponenet
