package fr.uni.institute.library.dao;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.uni.institute.library.business.inventory.Category;
import fr.uni.institute.library.dao.CategoryDao;
import fr.uni.institute.library.dao.DaoException;
import fr.uni.institute.library.dao.jdbc.CategoryDaoJdbc;

public class CategoryDaoJdbcTestCase {
	
	int resultat;
	CategoryDao categoryDao;

	@Before
	public void setUp() throws Exception {
		System.out.println("Initialisation des ressources de test");
		resultat = 9;
		Class.forName("com.mysql.jdbc.Driver");
		//Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/uni_library_db","root","root");
		categoryDao = new CategoryDaoJdbc(	null);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testResearchAllCategories() {
		
		
		try {
			System.out.println("test de recherche des categories en BD");
			Collection<Category> categories = categoryDao.researchAllCategories();
			//assertNotNull(categories);
			//assertEquals(resultat, categories.size());
		} catch (Exception e) {
			//fail(e.getMessage());
			System.out.println(e.getMessage());
		}
		//
		
	}

}
