
/*Создать класс Book с полями id, title, author, description, catId, status. 
 * Создать класс Category с полями id, title. 
 * Создать класс Database. 
 * Реализовать функционал:
- добавление книг
- редактирование книг
- удаление книг
- вывод книг по категории
- вывод категорий
- вывод категории по id
- добавление категорий

В методе main:

		Database db;		
		db.addBook(new Book(1, "Book1", "Chubas", "Stunning", 1, 1));

Создали ссылку db, но память не выделили и пытаемся вызвать метод addBook
Т.е. надо было: Database db = new Database();		

В классе Database в методе editBook достаточно создать один объект
класса Scanner

В классе Book в конструкторе параметр называется catID, а мы пишем:
		
		this.catId = catId;

Т.е. надо было: this.catId = catID;*/

 

public class Main {
	
	public static void main(String[] args) {
		
		Database db = new Database();
		
		db.addCategory(new Category(1, "Category1"));
		db.addCategory(new Category(2, "Category2"));
		db.addCategory(new Category(3, "Category3"));
		
		db.addBook(new Book(1, "Book1", "Author1","Stunning", 1, 1 ));
		db.addBook(new Book(2, "Book2", "Author 2", "Tarrific", 2, 1));
		db.addBook(new Book(3, "Book3", "Author 3", "Wonderful", 3, 0));
		
		db.showAll();
		
		Sysout("new line");
		
//		db.editBook(2);
//		db.deleteBook(1);
//		db.showCategoryById(1);
//		db.showCategoryById(0);
		
		
				
		
	}

}
