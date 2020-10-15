/*
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbtable.serializer;

import com.google.inject.Inject;
import com.sap.xsk.models.hdbtable.services.HdbTableGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class HdbTableSyntacticSequencer extends AbstractSyntacticSequencer {

	protected HdbTableGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ColumnType___SemicolonKeyword_3_1_RightCurlyBracketKeyword_3_2__a;
	protected AbstractElementAlias match_ColumnType___SemicolonKeyword_3_1_RightCurlyBracketKeyword_3_2__p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (HdbTableGrammarAccess) access;
		match_ColumnType___SemicolonKeyword_3_1_RightCurlyBracketKeyword_3_2__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getColumnTypeAccess().getSemicolonKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getColumnTypeAccess().getRightCurlyBracketKeyword_3_2()));
		match_ColumnType___SemicolonKeyword_3_1_RightCurlyBracketKeyword_3_2__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getColumnTypeAccess().getSemicolonKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getColumnTypeAccess().getRightCurlyBracketKeyword_3_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_ColumnType___SemicolonKeyword_3_1_RightCurlyBracketKeyword_3_2__a.equals(syntax))
				emit_ColumnType___SemicolonKeyword_3_1_RightCurlyBracketKeyword_3_2__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ColumnType___SemicolonKeyword_3_1_RightCurlyBracketKeyword_3_2__p.equals(syntax))
				emit_ColumnType___SemicolonKeyword_3_1_RightCurlyBracketKeyword_3_2__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     (';' '}')*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'length' '=' columnLength=INT
	 *     (rule start) (ambiguity) 'nullable' '=' columnNullable=BOOL
	 *     (rule start) (ambiguity) 'sqlType' '=' columnSqlType=ID
	 *     (rule start) (ambiguity) '{' 'name' '=' columnName=STRING
	 *     (rule start) (ambiguity) (rule start)
	 *     columnLength=INT ';' (ambiguity) 'length' '=' columnLength=INT
	 *     columnLength=INT ';' (ambiguity) 'nullable' '=' columnNullable=BOOL
	 *     columnLength=INT ';' (ambiguity) 'sqlType' '=' columnSqlType=ID
	 *     columnLength=INT ';' (ambiguity) '{' 'name' '=' columnName=STRING
	 *     columnLength=INT ';' (ambiguity) (rule end)
	 *     columnName=STRING ';' (ambiguity) 'length' '=' columnLength=INT
	 *     columnName=STRING ';' (ambiguity) 'nullable' '=' columnNullable=BOOL
	 *     columnName=STRING ';' (ambiguity) 'sqlType' '=' columnSqlType=ID
	 *     columnName=STRING ';' (ambiguity) '{' 'name' '=' columnName=STRING
	 *     columnName=STRING ';' (ambiguity) (rule end)
	 *     columnSqlType=ID ';' (ambiguity) 'length' '=' columnLength=INT
	 *     columnSqlType=ID ';' (ambiguity) 'nullable' '=' columnNullable=BOOL
	 *     columnSqlType=ID ';' (ambiguity) 'sqlType' '=' columnSqlType=ID
	 *     columnSqlType=ID ';' (ambiguity) '{' 'name' '=' columnName=STRING
	 *     columnSqlType=ID ';' (ambiguity) (rule end)
	 */
	protected void emit_ColumnType___SemicolonKeyword_3_1_RightCurlyBracketKeyword_3_2__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (';' '}')+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 *     columnNullable=BOOL (ambiguity) 'length' '=' columnLength=INT
	 *     columnNullable=BOOL (ambiguity) 'nullable' '=' columnNullable=BOOL
	 *     columnNullable=BOOL (ambiguity) 'sqlType' '=' columnSqlType=ID
	 *     columnNullable=BOOL (ambiguity) '{' 'name' '=' columnName=STRING
	 *     columnNullable=BOOL (ambiguity) (rule end)
	 */
	protected void emit_ColumnType___SemicolonKeyword_3_1_RightCurlyBracketKeyword_3_2__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
