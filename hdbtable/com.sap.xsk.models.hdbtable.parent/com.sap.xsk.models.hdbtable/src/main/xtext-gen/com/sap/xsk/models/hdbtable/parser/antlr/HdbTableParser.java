/*
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbtable.parser.antlr;

import com.google.inject.Inject;
import com.sap.xsk.models.hdbtable.parser.antlr.internal.InternalHdbTableParser;
import com.sap.xsk.models.hdbtable.services.HdbTableGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class HdbTableParser extends AbstractAntlrParser {

	@Inject
	private HdbTableGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalHdbTableParser createParser(XtextTokenStream stream) {
		return new InternalHdbTableParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "HdbTableModel";
	}

	public HdbTableGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(HdbTableGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
