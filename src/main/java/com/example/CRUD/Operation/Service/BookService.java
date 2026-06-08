//package com.example.CRUD.Operation.Service;
//
//import com.example.CRUD.Operation.Entity.Book;
//import com.example.CRUD.Operation.Repository.BookRepository;
//import lombok.AllArgsConstructor;
//import lombok.NoArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
////@NoArgsConstructor
//@Service
//public class BookService {
//
////    @Autowired
////    private final BookRepository repo;
////    public BookService(BookRepository repo) {
////        this.repo = repo;
////    }
//
//   @Autowired
//   private final BookRepository bookRepository;
//   public BookService(BookRepository bookRepository) {
//       this.bookRepository = bookRepository;
//   }
//
//   //(Book book)
//   //
//   //➡️ Ye parameter hai
//   //➡️ Matlab: method ko ek Book object input me milega
////    public Book addBook(Book book) {
////       Book save =  bookRepository.save(book);
////        return save;
////    }
//
////    public Book addBook(Book book){
////       Book save =  bookRepository.save(book);
////       return save;
////    }
//    public Book addBook(Book book){
//       Book saveee = bookRepository.save(book);
//       return saveee;
//    }
//
//
//
//
//    public Book added(Book book){
//       Book save = bookRepository.findByName(book);
//       return save;
//    }
//
//    public Book getservice(Integer id){
//        return bookRepository.getReferenceById(id);
//    }
//
//    public Book addBookk(Book book,Integer id) {
//        Book saveed = bookRepository.save(book);
//        return saveed;
//    }
//
//    public Book updateBook(Book book){
//        Book updatedBook = bookRepository.save(book);
//        return updatedBook;
//    }
//
//    public Book getBookByName(String name){
//        Book bookByTitle = bookRepository.findBookByTitle(name);
//        return bookByTitle;
//    }
//
//
//
//    public void deleteBook(Integer id){
//        bookRepository.deleteById(id);
//    }
//
//    public Book descBook(Book book){
//     Book save = bookRepository.findBookByTitle(book.getAuthor());
//     return save;
//    }
//}
