
package org.cts.com.service;

import java.util.List;

import org.cts.com.dao.ItemDao;
import org.cts.com.domain.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Q014787
 *
 */

@Service(value = "smuMessageService")
public class ItemServiceImpl implements ItemService {
	private static final Logger logger = LoggerFactory.getLogger(ItemServiceImpl.class);
	@Autowired
	private ItemDao itemDao;
	//String vcap="{\"cloudantNoSQLDB\":[{\"name\":\"lightblue-cloudant\",\"instance_name\":\"lightblue-cloudant\",\"binding_name\":null,\"credentials\":{\"apikey\":\"ArfRLJnGghzBjA7WRUS6cqfa3VCrt0X5s6yaZDWdKNw7\",\"host\":\"c7f097a9-1b39-44b2-b79b-2ae6e8be8140-bluemix.cloudant.com\",\"iam_apikey_description\":\"Auto generated apikey during resource-bind operation for Instance - crn:v1:bluemix:public:cloudantnosqldb:us-south:a/2f21cfa0b39a43ba96920ae2041c5789:ae57e2fa-d492-4f6f-a102-88f488b0b5c4::\",\"iam_apikey_name\":\"auto-generated-apikey-03b8c8f0-6f2e-46dd-9feb-fe04d9f6fc4b\",\"iam_role_crn\":\"crn:v1:bluemix:public:iam::::serviceRole:Manager\",\"iam_serviceid_crn\":\"crn:v1:bluemix:public:iam-identity::a/2f21cfa0b39a43ba96920ae2041c5789::serviceid:ServiceId-f3ece587-c2e2-41ce-82a2-416258c2c489\",\"password\":\"4851f59a188ee6494c427d1f6fc8d767270bd65bc487b752d70315f021f2ac44\",\"port\":443,\"url\":\"https://c7f097a9-1b39-44b2-b79b-2ae6e8be8140-bluemix:4851f59a188ee6494c427d1f6fc8d767270bd65bc487b752d70315f021f2ac44@c7f097a9-1b39-44b2-b79b-2ae6e8be8140-bluemix.cloudant.com\",\"username\":\"c7f097a9-1b39-44b2-b79b-2ae6e8be8140-bluemix\"},\"syslog_drain_url\":null,\"volume_mounts\":[],\"label\":\"cloudantNoSQLDB\",\"provider\":null,\"plan\":\"Lite\",\"tags\":[\"data_management\",\"ibm_created\",\"lite\",\"ibm_dedicated_public\",\"ibmcloud-alias\"]}]}";

//	@Override
//	public Customer getItem(String id) throws Exception {
//		return itemDao.getItem(id);
//	}
//
//	@Override
//	public Customer saveItem(Customer smuMessage) throws Exception {
//		return itemDao.saveItem(smuMessage);
//	}
//
//	@Override
//	public List<Customer> getItems() throws Exception {
//		return itemDao.getItems();
//	}
}
