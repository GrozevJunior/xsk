/*
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbview.tests

import com.google.inject.Inject
import com.sap.xsk.models.hdbview.hdbView.HdbViewModel
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(HdbViewInjectorProvider)
class HdbViewParsingTest {
	@Inject
	ParseHelper<HdbViewModel> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			schema = "SAP_SPORTS_FND";
			query = "
				SELECT
					MATCH_ID,
					TEAM_ID,
					PERSON_ID
				FROM \"sap.sports.fnd.module.playerstatistics.private.table::ABSENT_PLAYERS\"
			";
			depends_on = [
				"sap.sports.fnd.module.playerstatistics.private.table::ABSENT_PLAYERS"
			];
			
		''')
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: «errors.join(", ")»''', errors.isEmpty)
	}
}
