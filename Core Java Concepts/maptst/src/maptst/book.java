package maptst;

public class book {
	
 int bookid;
 String bookname;
 String author;
 String bookpublish;
 int bookqty;

public book(int bookid,String bookname,String author,String bookpublish, int bookqty)

{
	this.bookid = bookid;
	this.bookname = bookname;
	this.author = author;
	this.bookpublish = bookpublish;
	this.bookqty = bookqty;
}


public int getbookid() {
	 return bookid;
	 }
	 
	 public String getbookname() {
	 return bookname;
	 }
	 
	 public String getauthor() {
	 return author;
	 }
	 
	 public String getbookpublish() {
	 return bookpublish;
	 }
	 
	 public int getbookqty() {
	 return bookqty;
	 }


}
