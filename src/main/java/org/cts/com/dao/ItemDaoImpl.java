package org.cts.com.dao;

import java.util.List;

import org.cts.com.domain.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cloudant.client.api.Database;
import com.cloudant.client.api.model.Response;
import com.cloudant.client.api.views.AllDocsRequest;
import com.cloudant.client.org.lightcouch.NoDocumentException;

/**
 * @author Q014787
 * This is Java class that will used for get cloudant Items.
 */
@Repository
public class ItemDaoImpl implements ItemDao {

//	@Autowired
//	Database database;
//
//	private static final Logger logger = LoggerFactory.getLogger(ItemDaoImpl.class);
//
//	@Override
//	public Customer getItem(String id) {
//		Customer smuMessage = null;
//		try {
//			//smuMessage = database.find(SmuMessage.class, id);
//			if (logger.isDebugEnabled())
//				logger.debug("Returning " + smuMessage);
//		} catch (NoDocumentException e) {
//			logger.debug("Document not found for SmuMessage", e);
//		}
//		return smuMessage;
//	}
//
//	@Override
//	public Customer saveItem(Customer smuMessage) {
//		try {
//			Response obj =  database.save(smuMessage);
//			smuMessage.setCustomerId(obj.getId());
//			smuMessage.set_rev(obj.getRev());
//			logger.debug("Smu Message Save " + smuMessage);
//		} catch (Exception e) {
//			logger.debug("Smu Message not Saved.", e);
//			logger.error(e.getMessage());
//		}
//		return smuMessage;
//	}
//
//	@Override
//	public List<Customer> getItems() {
//		List<Customer> objList = null;
//		try {
//			AllDocsRequest obj = database.getAllDocsRequestBuilder().build();
//			objList = obj.getResponse().getDocsAs(Customer.class);
//			if (logger.isDebugEnabled())
//				logger.debug("Returning " + objList.toString());
//		} catch (Exception e) {
//			logger.debug("Document not found for SmuMessage", e);
//		}
//		return objList;
//	}
}
