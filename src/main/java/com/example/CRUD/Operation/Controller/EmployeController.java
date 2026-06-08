//package com.example.CRUD.Operation.Controller;
//
//import com.example.CRUD.Operation.Entity.Employee;
//import com.example.CRUD.Operation.Service.EmployeeService;
//import lombok.NoArgsConstructor;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RequestMapping("/add")
//@RestController
//@RequiredArgsConstructor
//
//
//public class EmployeController {
//    private final EmployeeService employeeService;
//
//
////    @PostMapping("/post")
////    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
////        Employee emp = employeeService.addEmpl(employee);
////        return ResponseEntity.ok(emp);
////    }
//    @PostMapping("/add")
//    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
//        Employee emp = employeeService.addEmpl(employee);
//        return ResponseEntity.ok(emp);
//    }
//
////    @GetMapping("/{id}")
////    public ResponseEntity<Employee> getEmployees(@PathVariable Integer id) {
////        Employee empp = employeeService.getEmployee(id);
////        return ResponseEntity.ok(empp);
////
////    }
//    @GetMapping("/{id}")
//    public ResponseEntity<Employee> getEMployee(@PathVariable int id){
//        Employee emp = employeeService.getEmployee(id);
//        return ResponseEntity.ok(emp);
//    }
//
//    @PutMapping("/update")
//    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
//        Employee update = employeeService.updateEmployee(employee);
//        return ResponseEntity.ok(update);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteEmployee(@PathVariable Integer id) {
//        employeeService.deleteEmployee(id);
//        return ResponseEntity.ok().build();
//    }
//}
