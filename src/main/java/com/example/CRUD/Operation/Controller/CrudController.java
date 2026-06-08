//package com.example.CRUD.Operation.Controller;
//
//import com.example.CRUD.Operation.Entity.Book;
//import com.example.CRUD.Operation.Service.BookService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//
//@RestController  //(Response body + our controller annotation)
//public class CrudController {
//    private final BookService bookService;
//
//    @Autowired
//    public CrudController(BookService  bookService){
//        this.bookService = bookService;
//    }
////    @PostMapping
////    public ResponseEntity<Book> save (@RequestBody Book book){
////        Book boo = bookService.addBook(book);
////        return ResponseEntity.ok(boo);
////    }
//
//    @PostMapping
//    public ResponseEntity<Book> add(@RequestBody Book book){
//        Book bo = bookService.addBook(book);
//        return ResponseEntity.ok(bo);
//    }
//
//
//
//    @PostMapping("/post/{id}")
//    public ResponseEntity<Book> post(@RequestBody Book book,@PathVariable Integer id) {
//        Book saved = bookService.addBookk(book,id);
//        return ResponseEntity.ok(saved);
//    }
//
//    @PostMapping("/add")
//    public ResponseEntity<Book> addded(@RequestBody Book book){
//        Book saved = bookService.added(book);
//        return ResponseEntity.ok(saved);
//    }
//
//
//    @GetMapping
//    public ResponseEntity<Book> Del(@RequestParam Integer id){
//        Book get = bookService.getservice(id);
//        return ResponseEntity.ok(get);
//    }
//
//
//
//
//    @PutMapping("/book")
//    public ResponseEntity<Book> updateBook(@RequestBody Book book) {
//        Book updatedBook = bookService.updateBook(book);
//        return ResponseEntity.ok(updatedBook);
//    }
//
//    @GetMapping("/Getbook/{bookName}")
//    public ResponseEntity<Book> getBookByName(@PathVariable("bookName")  String name) {
//        bookService.getBookByName(name);
//        return ResponseEntity.ok(bookService.getBookByName(name));
//    }
//
//    @DeleteMapping("/Del/{id}")
//    public ResponseEntity<Void> deleteBook(@PathVariable("id") Integer id) {
//        bookService.deleteBook(id);
//        return ResponseEntity.ok().build();
//    }
//
//
//
//
//    @PostMapping("/des")
//    public ResponseEntity<Book> desc(@RequestBody Book book){
//        bookService.descBook(book);
//        return ResponseEntity.ok(book);
//    }
//}
