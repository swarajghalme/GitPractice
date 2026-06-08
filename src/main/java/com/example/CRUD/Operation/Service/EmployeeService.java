//package com.example.CRUD.Operation.Service;
//
//import com.example.CRUD.Operation.Entity.Employee;
//import com.example.CRUD.Operation.Repository.EmployeeRepo;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestBody;
//
//@Service
//@RequiredArgsConstructor
//public class EmployeeService {
//
//    private final EmployeeRepo employeeRepo;
//
////    public Employee addEmpl(Employee employee){
////        if(employee.getSalary()<15000){
////            throw new RuntimeException("Salary is very less than 15000");
////        }
////        return employeeRepo.save(employee);
////    }
//
//   public Employee addEmpl(Employee employee) {
//       if(employee.getSalary()<15000){
//           throw new RuntimeException("Salary less than 15000");
//       }
//       return employeeRepo.save(employee);
//   }
//
////    public Employee getEmployee(Integer id) {
////        return employeeRepo.findById(id).orElse(null);
////    }
//    public Employee getEmployee(Integer id) {
//        return employeeRepo.findById(id).orElse(null);
//    }
//
//
//
//    public Employee updateEmployee(Employee employee){
//        Employee exist = employeeRepo.findById(employee.getId()).orElseThrow(() -> new RuntimeException("Employee not found"));
//
//        exist.setSalary(employee.getSalary());
//        exist.setName(employee.getName());
//        return employeeRepo.save(exist);
//    }
//
//    public Employee updateEmployee(@RequestBody Employee employee) {
//       Employee exist = employeeRepo.findById(employee.getId()).orElseThrow(()->new RuntimeException("Employee not found"));
//       exist.setSalary(employee.getSalary());
//       exist.setName(employee.getName());
//       return employeeRepo.save(exist);
//    }
//
//    public void deleteEmployee(Integer id){
//        employeeRepo.deleteById(id);
//    }
//
//
//}
