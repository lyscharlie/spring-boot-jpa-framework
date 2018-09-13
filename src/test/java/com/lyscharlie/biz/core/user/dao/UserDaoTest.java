package com.lyscharlie.biz.core.user.dao;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lyscharlie.biz.core.user.domain.UserDO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

	@Autowired
	private UserDao userDao;

	@Test
	public void testFindAll() {
		List<UserDO> list = this.userDao.findAll();
		if (CollectionUtils.isNotEmpty(list)) {
			for (UserDO user : list) {
				System.out.println(user.toString());
			}
		}
		assertTrue(CollectionUtils.isNotEmpty(list));
	}

	@Test
	public void testFindAllSort() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAllIterableOfID() {
		fail("Not yet implemented");
	}

	@Test
	public void testSaveIterableOfS() {
		fail("Not yet implemented");
	}

	@Test
	public void testFlush() {
		fail("Not yet implemented");
	}

	@Test
	public void testSaveAndFlush() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteInBatch() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteAllInBatch() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetOne() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAllExampleOfS() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAllExampleOfSSort() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAllSort1() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAllPageable() {
		fail("Not yet implemented");
	}

	@Test
	public void testSaveS() {
		fail("Not yet implemented");
	}

	@Test
	public void testSaveIterableOfS1() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindOneID() {
		fail("Not yet implemented");
	}

	@Test
	public void testExistsID() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAll1() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAllIterableOfID1() {
		fail("Not yet implemented");
	}

	@Test
	public void testCount() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteID() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteT() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteIterableOfQextendsT() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindOneExampleOfS() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAllExampleOfS1() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAllExampleOfSSort1() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAllExampleOfSPageable() {
		fail("Not yet implemented");
	}

	@Test
	public void testCountExampleOfS() {
		fail("Not yet implemented");
	}

	@Test
	public void testExistsExampleOfS() {
		fail("Not yet implemented");
	}

}
