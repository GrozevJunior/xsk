/*
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.xsodata.tests

import com.google.inject.Inject
import com.sap.xsk.models.xsodata.model.XsOData
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(ModelInjectorProvider)
class ModelParsingTest {
	@Inject
	ParseHelper<XsOData> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			  service namespace product_project.odata  {
			  
			    product_project.db::Products.Orders as Orders
			    		navigates(Items4Orders as Items)
			 
			     create events(before product_project.xsjs:ProductsLib.xsjslib::beforeCreateOrder)
			     delete using product_project.xsjs:ProductsLib.xsjslib::deleteOrder;
			  
			    
			   product_project.db::Products.Item as Items
			     create events(before product_project.xsjs:ProductsLib.xsjslib::beforeCreateItem) 
			     update forbidden;
			 
			 
			     association Items4Orders principal Orders(Id)
			        multiplicity 1 dependent Items(OrderId) multiplicity *;
			        
			  }
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
}
