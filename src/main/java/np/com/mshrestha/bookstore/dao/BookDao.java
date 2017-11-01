package np.com.mshrestha.bookstore.dao;

import java.util.List;
import np.com.mshrestha.bookstore.model.Book;

public interface BookDao {

	/*
	 * CREATE and UPDATE
	 */
	public void saveBook(Book book); // create and update

	/*
	 * READ
	 */
	
	/*this is git command*/
	public List<Book> listBooks();
	public Book getBook(Long id);

	/*
	 * DELETE
	 */
	public void deleteBook(Long id);
}
