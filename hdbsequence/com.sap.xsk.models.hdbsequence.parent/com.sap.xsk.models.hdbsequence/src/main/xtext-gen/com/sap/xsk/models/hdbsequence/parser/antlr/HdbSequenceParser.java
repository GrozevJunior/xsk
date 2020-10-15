/*
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbsequence.parser.antlr;

import com.google.inject.Inject;
import com.sap.xsk.models.hdbsequence.parser.antlr.internal.InternalHdbSequenceParser;
import com.sap.xsk.models.hdbsequence.services.HdbSequenceGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class HdbSequenceParser extends AbstractAntlrParser {

	@Inject
	private HdbSequenceGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalHdbSequenceParser createParser(XtextTokenStream stream) {
		return new InternalHdbSequenceParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "HdbSequenceModel";
	}

	public HdbSequenceGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(HdbSequenceGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
