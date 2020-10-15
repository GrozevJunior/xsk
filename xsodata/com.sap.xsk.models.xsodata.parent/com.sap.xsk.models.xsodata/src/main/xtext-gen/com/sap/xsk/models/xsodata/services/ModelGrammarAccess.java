/*
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.xsodata.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ModelGrammarAccess extends AbstractGrammarElementFinder {
	
	public class XsODataElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.xsodata.Model.XsOData");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsTypeParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//XsOData:
		//	elements+=Type*;
		@Override public ParserRule getRule() { return rule; }
		
		//elements+=Type*
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//Type
		public RuleCall getElementsTypeParserRuleCall_0() { return cElementsTypeParserRuleCall_0; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.xsodata.Model.Type");
		private final RuleCall cServiceParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Type:
		//	Service;
		@Override public ParserRule getRule() { return rule; }
		
		//Service
		public RuleCall getServiceParserRuleCall() { return cServiceParserRuleCall; }
	}
	public class ServiceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.xsodata.Model.Service");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cServiceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNamespaceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameQualifiedNameParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cEntitiesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cEntitiesEntityParserRuleCall_4_0 = (RuleCall)cEntitiesAssignment_4.eContents().get(0);
		private final Assignment cAssociationsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cAssociationsAssociationParserRuleCall_5_0 = (RuleCall)cAssociationsAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Service:
		//	'service' 'namespace' name=QualifiedName '{'
		//	entities+=Entity*
		//	associations+=Association*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'service' 'namespace' name=QualifiedName '{' entities+=Entity* associations+=Association* '}'
		public Group getGroup() { return cGroup; }
		
		//'service'
		public Keyword getServiceKeyword_0() { return cServiceKeyword_0; }
		
		//'namespace'
		public Keyword getNamespaceKeyword_1() { return cNamespaceKeyword_1; }
		
		//name=QualifiedName
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_2_0() { return cNameQualifiedNameParserRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//entities+=Entity*
		public Assignment getEntitiesAssignment_4() { return cEntitiesAssignment_4; }
		
		//Entity
		public RuleCall getEntitiesEntityParserRuleCall_4_0() { return cEntitiesEntityParserRuleCall_4_0; }
		
		//associations+=Association*
		public Assignment getAssociationsAssignment_5() { return cAssociationsAssignment_5; }
		
		//Association
		public RuleCall getAssociationsAssociationParserRuleCall_5_0() { return cAssociationsAssociationParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.xsodata.Model.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ('.' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.xsodata.Model.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNamespaceAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNamespaceEntityQualifiedNamespaceParserRuleCall_0_0 = (RuleCall)cNamespaceAssignment_0.eContents().get(0);
		private final Keyword cColonColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEntityQualifiedNameParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cAsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAliasAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAliasEntityQualifiedAliasParserRuleCall_4_0 = (RuleCall)cAliasAssignment_4.eContents().get(0);
		private final Assignment cNavigatesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cNavigatesNavigationParserRuleCall_5_0 = (RuleCall)cNavigatesAssignment_5.eContents().get(0);
		private final Assignment cCreateEventsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cCreateEventsCreateEventParserRuleCall_6_0 = (RuleCall)cCreateEventsAssignment_6.eContents().get(0);
		private final Assignment cDeleteUsingAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cDeleteUsingDeleteUsingParserRuleCall_7_0 = (RuleCall)cDeleteUsingAssignment_7.eContents().get(0);
		private final Assignment cUpdateAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cUpdateUpdateParserRuleCall_8_0 = (RuleCall)cUpdateAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//Entity:
		//	namespace=EntityQualifiedNamespace '::' name=EntityQualifiedName 'as' alias=EntityQualifiedAlias
		//	navigates+=Navigation*
		//	createEvents+=CreateEvent*
		//	deleteUsing+=DeleteUsing?
		//	update+=Update? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//namespace=EntityQualifiedNamespace '::' name=EntityQualifiedName 'as' alias=EntityQualifiedAlias navigates+=Navigation*
		//createEvents+=CreateEvent* deleteUsing+=DeleteUsing? update+=Update? ';'
		public Group getGroup() { return cGroup; }
		
		//namespace=EntityQualifiedNamespace
		public Assignment getNamespaceAssignment_0() { return cNamespaceAssignment_0; }
		
		//EntityQualifiedNamespace
		public RuleCall getNamespaceEntityQualifiedNamespaceParserRuleCall_0_0() { return cNamespaceEntityQualifiedNamespaceParserRuleCall_0_0; }
		
		//'::'
		public Keyword getColonColonKeyword_1() { return cColonColonKeyword_1; }
		
		//name=EntityQualifiedName
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EntityQualifiedName
		public RuleCall getNameEntityQualifiedNameParserRuleCall_2_0() { return cNameEntityQualifiedNameParserRuleCall_2_0; }
		
		//'as'
		public Keyword getAsKeyword_3() { return cAsKeyword_3; }
		
		//alias=EntityQualifiedAlias
		public Assignment getAliasAssignment_4() { return cAliasAssignment_4; }
		
		//EntityQualifiedAlias
		public RuleCall getAliasEntityQualifiedAliasParserRuleCall_4_0() { return cAliasEntityQualifiedAliasParserRuleCall_4_0; }
		
		//navigates+=Navigation*
		public Assignment getNavigatesAssignment_5() { return cNavigatesAssignment_5; }
		
		//Navigation
		public RuleCall getNavigatesNavigationParserRuleCall_5_0() { return cNavigatesNavigationParserRuleCall_5_0; }
		
		//createEvents+=CreateEvent*
		public Assignment getCreateEventsAssignment_6() { return cCreateEventsAssignment_6; }
		
		//CreateEvent
		public RuleCall getCreateEventsCreateEventParserRuleCall_6_0() { return cCreateEventsCreateEventParserRuleCall_6_0; }
		
		//deleteUsing+=DeleteUsing?
		public Assignment getDeleteUsingAssignment_7() { return cDeleteUsingAssignment_7; }
		
		//DeleteUsing
		public RuleCall getDeleteUsingDeleteUsingParserRuleCall_7_0() { return cDeleteUsingDeleteUsingParserRuleCall_7_0; }
		
		//update+=Update?
		public Assignment getUpdateAssignment_8() { return cUpdateAssignment_8; }
		
		//Update
		public RuleCall getUpdateUpdateParserRuleCall_8_0() { return cUpdateUpdateParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
	}
	public class EntityQualifiedNamespaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.xsodata.Model.EntityQualifiedNamespace");
		private final RuleCall cQualifiedNameParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//EntityQualifiedNamespace:
		//	QualifiedName;
		@Override public ParserRule getRule() { return rule; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall() { return cQualifiedNameParserRuleCall; }
	}
	public class EntityQualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.xsodata.Model.EntityQualifiedName");
		private final RuleCall cQualifiedNameParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//EntityQualifiedName:
		//	QualifiedName;
		@Override public ParserRule getRule() { return rule; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall() { return cQualifiedNameParserRuleCall; }
	}
	public class EntityQualifiedAliasElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.xsodata.Model.EntityQualifiedAlias");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//EntityQualifiedAlias:
		//	ID;
		@Override public ParserRule getRule() { return rule; }
		
		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	public class NavigationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.xsodata.Model.Navigation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNavigatesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAssociationAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAssociationNavigationAssociationParserRuleCall_2_0 = (RuleCall)cAssociationAssignment_2.eContents().get(0);
		private final Keyword cAsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAliasAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAliasNavigationAliasParserRuleCall_4_0 = (RuleCall)cAliasAssignment_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Navigation:
		//	'navigates' '(' association=NavigationAssociation 'as' alias=NavigationAlias ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'navigates' '(' association=NavigationAssociation 'as' alias=NavigationAlias ')'
		public Group getGroup() { return cGroup; }
		
		//'navigates'
		public Keyword getNavigatesKeyword_0() { return cNavigatesKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//association=NavigationAssociation
		public Assignment getAssociationAssignment_2() { return cAssociationAssignment_2; }
		
		//NavigationAssociation
		public RuleCall getAssociationNavigationAssociationParserRuleCall_2_0() { return cAssociationNavigationAssociationParserRuleCall_2_0; }
		
		//'as'
		public Keyword getAsKeyword_3() { return cAsKeyword_3; }
		
		//alias=NavigationAlias
		public Assignment getAliasAssignment_4() { return cAliasAssignment_4; }
		
		//NavigationAlias
		public RuleCall getAliasNavigationAliasParserRuleCall_4_0() { return cAliasNavigationAliasParserRuleCall_4_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}
	public class NavigationAssociationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.xsodata.Model.NavigationAssociation");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//NavigationAssociation:
		//	ID;
		@Override public ParserRule getRule() { return rule; }
		
		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	public class NavigationAliasElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.xsodata.Model.NavigationAlias");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//NavigationAlias:
		//	ID;
		@Override public ParserRule getRule() { return rule; }
		
		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	public class CreateEventElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.xsodata.Model.CreateEvent");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCreateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cEventsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cBeforeKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final RuleCall cIDTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final Keyword cXsjsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cColonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final RuleCall cIDTerminalRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		private final Keyword cXsjslibKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cColonColonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final RuleCall cIDTerminalRuleCall_10 = (RuleCall)cGroup.eContents().get(10);
		private final Keyword cRightParenthesisKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//CreateEvent:
		//	'create' 'events' '(' 'before' ID '.xsjs' ':' ID '.xsjslib' '::' ID ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'create' 'events' '(' 'before' ID '.xsjs' ':' ID '.xsjslib' '::' ID ')'
		public Group getGroup() { return cGroup; }
		
		//'create'
		public Keyword getCreateKeyword_0() { return cCreateKeyword_0; }
		
		//'events'
		public Keyword getEventsKeyword_1() { return cEventsKeyword_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//'before'
		public Keyword getBeforeKeyword_3() { return cBeforeKeyword_3; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_4() { return cIDTerminalRuleCall_4; }
		
		//'.xsjs'
		public Keyword getXsjsKeyword_5() { return cXsjsKeyword_5; }
		
		//':'
		public Keyword getColonKeyword_6() { return cColonKeyword_6; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_7() { return cIDTerminalRuleCall_7; }
		
		//'.xsjslib'
		public Keyword getXsjslibKeyword_8() { return cXsjslibKeyword_8; }
		
		//'::'
		public Keyword getColonColonKeyword_9() { return cColonColonKeyword_9; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_10() { return cIDTerminalRuleCall_10; }
		
		//')'
		public Keyword getRightParenthesisKeyword_11() { return cRightParenthesisKeyword_11; }
	}
	public class DeleteUsingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.xsodata.Model.DeleteUsing");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDeleteKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cUsingKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cXsjsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cColonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final RuleCall cIDTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final Keyword cXsjslibKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonColonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final RuleCall cIDTerminalRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		
		//DeleteUsing:
		//	'delete' 'using' ID '.xsjs' ':' ID '.xsjslib' '::' ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'delete' 'using' ID '.xsjs' ':' ID '.xsjslib' '::' ID
		public Group getGroup() { return cGroup; }
		
		//'delete'
		public Keyword getDeleteKeyword_0() { return cDeleteKeyword_0; }
		
		//'using'
		public Keyword getUsingKeyword_1() { return cUsingKeyword_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_2() { return cIDTerminalRuleCall_2; }
		
		//'.xsjs'
		public Keyword getXsjsKeyword_3() { return cXsjsKeyword_3; }
		
		//':'
		public Keyword getColonKeyword_4() { return cColonKeyword_4; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_5() { return cIDTerminalRuleCall_5; }
		
		//'.xsjslib'
		public Keyword getXsjslibKeyword_6() { return cXsjslibKeyword_6; }
		
		//'::'
		public Keyword getColonColonKeyword_7() { return cColonColonKeyword_7; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_8() { return cIDTerminalRuleCall_8; }
	}
	public class UpdateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.xsodata.Model.Update");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUpdateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cForbiddenKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Update:
		//	'update' 'forbidden';
		@Override public ParserRule getRule() { return rule; }
		
		//'update' 'forbidden'
		public Group getGroup() { return cGroup; }
		
		//'update'
		public Keyword getUpdateKeyword_0() { return cUpdateKeyword_0; }
		
		//'forbidden'
		public Keyword getForbiddenKeyword_1() { return cForbiddenKeyword_1; }
	}
	public class AssociationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.xsodata.Model.Association");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAssociationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cPrincipalKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPrincipalAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPrincipalAssociationPrincipalParserRuleCall_3_0 = (RuleCall)cPrincipalAssignment_3.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cPrincipalKeyAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cPrincipalKeyAssociationPrincipalKeyParserRuleCall_5_0 = (RuleCall)cPrincipalKeyAssignment_5.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cMultiplicityKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPrincipalMultiplicityAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPrincipalMultiplicityMultiplicityTypeParserRuleCall_8_0 = (RuleCall)cPrincipalMultiplicityAssignment_8.eContents().get(0);
		private final Keyword cDependentKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cDependentAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cDependentAssociationDependentParserRuleCall_10_0 = (RuleCall)cDependentAssignment_10.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cDependentPropertyAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cDependentPropertyAssociationDependentPropertyParserRuleCall_12_0 = (RuleCall)cDependentPropertyAssignment_12.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cMultiplicityKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Assignment cDependentMultiplicityAssignment_15 = (Assignment)cGroup.eContents().get(15);
		private final RuleCall cDependentMultiplicityMultiplicityTypeParserRuleCall_15_0 = (RuleCall)cDependentMultiplicityAssignment_15.eContents().get(0);
		private final Keyword cSemicolonKeyword_16 = (Keyword)cGroup.eContents().get(16);
		
		//Association:
		//	'association' name=ID 'principal' principal=AssociationPrincipal '(' principalKey=AssociationPrincipalKey ')'
		//	'multiplicity' principalMultiplicity=MultiplicityType 'dependent' dependent=AssociationDependent '('
		//	dependentProperty=AssociationDependentProperty ')' 'multiplicity' dependentMultiplicity=MultiplicityType ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'association' name=ID 'principal' principal=AssociationPrincipal '(' principalKey=AssociationPrincipalKey ')'
		//'multiplicity' principalMultiplicity=MultiplicityType 'dependent' dependent=AssociationDependent '('
		//dependentProperty=AssociationDependentProperty ')' 'multiplicity' dependentMultiplicity=MultiplicityType ';'
		public Group getGroup() { return cGroup; }
		
		//'association'
		public Keyword getAssociationKeyword_0() { return cAssociationKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'principal'
		public Keyword getPrincipalKeyword_2() { return cPrincipalKeyword_2; }
		
		//principal=AssociationPrincipal
		public Assignment getPrincipalAssignment_3() { return cPrincipalAssignment_3; }
		
		//AssociationPrincipal
		public RuleCall getPrincipalAssociationPrincipalParserRuleCall_3_0() { return cPrincipalAssociationPrincipalParserRuleCall_3_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_4() { return cLeftParenthesisKeyword_4; }
		
		//principalKey=AssociationPrincipalKey
		public Assignment getPrincipalKeyAssignment_5() { return cPrincipalKeyAssignment_5; }
		
		//AssociationPrincipalKey
		public RuleCall getPrincipalKeyAssociationPrincipalKeyParserRuleCall_5_0() { return cPrincipalKeyAssociationPrincipalKeyParserRuleCall_5_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_6() { return cRightParenthesisKeyword_6; }
		
		//'multiplicity'
		public Keyword getMultiplicityKeyword_7() { return cMultiplicityKeyword_7; }
		
		//principalMultiplicity=MultiplicityType
		public Assignment getPrincipalMultiplicityAssignment_8() { return cPrincipalMultiplicityAssignment_8; }
		
		//MultiplicityType
		public RuleCall getPrincipalMultiplicityMultiplicityTypeParserRuleCall_8_0() { return cPrincipalMultiplicityMultiplicityTypeParserRuleCall_8_0; }
		
		//'dependent'
		public Keyword getDependentKeyword_9() { return cDependentKeyword_9; }
		
		//dependent=AssociationDependent
		public Assignment getDependentAssignment_10() { return cDependentAssignment_10; }
		
		//AssociationDependent
		public RuleCall getDependentAssociationDependentParserRuleCall_10_0() { return cDependentAssociationDependentParserRuleCall_10_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_11() { return cLeftParenthesisKeyword_11; }
		
		//dependentProperty=AssociationDependentProperty
		public Assignment getDependentPropertyAssignment_12() { return cDependentPropertyAssignment_12; }
		
		//AssociationDependentProperty
		public RuleCall getDependentPropertyAssociationDependentPropertyParserRuleCall_12_0() { return cDependentPropertyAssociationDependentPropertyParserRuleCall_12_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_13() { return cRightParenthesisKeyword_13; }
		
		//'multiplicity'
		public Keyword getMultiplicityKeyword_14() { return cMultiplicityKeyword_14; }
		
		//dependentMultiplicity=MultiplicityType
		public Assignment getDependentMultiplicityAssignment_15() { return cDependentMultiplicityAssignment_15; }
		
		//MultiplicityType
		public RuleCall getDependentMultiplicityMultiplicityTypeParserRuleCall_15_0() { return cDependentMultiplicityMultiplicityTypeParserRuleCall_15_0; }
		
		//';'
		public Keyword getSemicolonKeyword_16() { return cSemicolonKeyword_16; }
	}
	public class AssociationPrincipalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.xsodata.Model.AssociationPrincipal");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//AssociationPrincipal:
		//	ID;
		@Override public ParserRule getRule() { return rule; }
		
		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	public class AssociationPrincipalKeyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.xsodata.Model.AssociationPrincipalKey");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//AssociationPrincipalKey:
		//	ID;
		@Override public ParserRule getRule() { return rule; }
		
		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	public class AssociationDependentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.xsodata.Model.AssociationDependent");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//AssociationDependent:
		//	ID;
		@Override public ParserRule getRule() { return rule; }
		
		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	public class AssociationDependentPropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.xsodata.Model.AssociationDependentProperty");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//AssociationDependentProperty:
		//	ID;
		@Override public ParserRule getRule() { return rule; }
		
		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	public class MultiplicityTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.sap.xsk.models.xsodata.Model.MultiplicityType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cAsteriskKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cDigitOneKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//MultiplicityType:
		//	'*' | '1';
		@Override public ParserRule getRule() { return rule; }
		
		//'*' | '1'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'*'
		public Keyword getAsteriskKeyword_0() { return cAsteriskKeyword_0; }
		
		//'1'
		public Keyword getDigitOneKeyword_1() { return cDigitOneKeyword_1; }
	}
	
	
	private final XsODataElements pXsOData;
	private final TypeElements pType;
	private final ServiceElements pService;
	private final QualifiedNameElements pQualifiedName;
	private final EntityElements pEntity;
	private final EntityQualifiedNamespaceElements pEntityQualifiedNamespace;
	private final EntityQualifiedNameElements pEntityQualifiedName;
	private final EntityQualifiedAliasElements pEntityQualifiedAlias;
	private final NavigationElements pNavigation;
	private final NavigationAssociationElements pNavigationAssociation;
	private final NavigationAliasElements pNavigationAlias;
	private final CreateEventElements pCreateEvent;
	private final DeleteUsingElements pDeleteUsing;
	private final UpdateElements pUpdate;
	private final AssociationElements pAssociation;
	private final AssociationPrincipalElements pAssociationPrincipal;
	private final AssociationPrincipalKeyElements pAssociationPrincipalKey;
	private final AssociationDependentElements pAssociationDependent;
	private final AssociationDependentPropertyElements pAssociationDependentProperty;
	private final MultiplicityTypeElements pMultiplicityType;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ModelGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pXsOData = new XsODataElements();
		this.pType = new TypeElements();
		this.pService = new ServiceElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pEntity = new EntityElements();
		this.pEntityQualifiedNamespace = new EntityQualifiedNamespaceElements();
		this.pEntityQualifiedName = new EntityQualifiedNameElements();
		this.pEntityQualifiedAlias = new EntityQualifiedAliasElements();
		this.pNavigation = new NavigationElements();
		this.pNavigationAssociation = new NavigationAssociationElements();
		this.pNavigationAlias = new NavigationAliasElements();
		this.pCreateEvent = new CreateEventElements();
		this.pDeleteUsing = new DeleteUsingElements();
		this.pUpdate = new UpdateElements();
		this.pAssociation = new AssociationElements();
		this.pAssociationPrincipal = new AssociationPrincipalElements();
		this.pAssociationPrincipalKey = new AssociationPrincipalKeyElements();
		this.pAssociationDependent = new AssociationDependentElements();
		this.pAssociationDependentProperty = new AssociationDependentPropertyElements();
		this.pMultiplicityType = new MultiplicityTypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.sap.xsk.models.xsodata.Model".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//XsOData:
	//	elements+=Type*;
	public XsODataElements getXsODataAccess() {
		return pXsOData;
	}
	
	public ParserRule getXsODataRule() {
		return getXsODataAccess().getRule();
	}
	
	//Type:
	//	Service;
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//Service:
	//	'service' 'namespace' name=QualifiedName '{'
	//	entities+=Entity*
	//	associations+=Association*
	//	'}';
	public ServiceElements getServiceAccess() {
		return pService;
	}
	
	public ParserRule getServiceRule() {
		return getServiceAccess().getRule();
	}
	
	//QualifiedName:
	//	ID ('.' ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//Entity:
	//	namespace=EntityQualifiedNamespace '::' name=EntityQualifiedName 'as' alias=EntityQualifiedAlias
	//	navigates+=Navigation*
	//	createEvents+=CreateEvent*
	//	deleteUsing+=DeleteUsing?
	//	update+=Update? ';';
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}
	
	//EntityQualifiedNamespace:
	//	QualifiedName;
	public EntityQualifiedNamespaceElements getEntityQualifiedNamespaceAccess() {
		return pEntityQualifiedNamespace;
	}
	
	public ParserRule getEntityQualifiedNamespaceRule() {
		return getEntityQualifiedNamespaceAccess().getRule();
	}
	
	//EntityQualifiedName:
	//	QualifiedName;
	public EntityQualifiedNameElements getEntityQualifiedNameAccess() {
		return pEntityQualifiedName;
	}
	
	public ParserRule getEntityQualifiedNameRule() {
		return getEntityQualifiedNameAccess().getRule();
	}
	
	//EntityQualifiedAlias:
	//	ID;
	public EntityQualifiedAliasElements getEntityQualifiedAliasAccess() {
		return pEntityQualifiedAlias;
	}
	
	public ParserRule getEntityQualifiedAliasRule() {
		return getEntityQualifiedAliasAccess().getRule();
	}
	
	//Navigation:
	//	'navigates' '(' association=NavigationAssociation 'as' alias=NavigationAlias ')';
	public NavigationElements getNavigationAccess() {
		return pNavigation;
	}
	
	public ParserRule getNavigationRule() {
		return getNavigationAccess().getRule();
	}
	
	//NavigationAssociation:
	//	ID;
	public NavigationAssociationElements getNavigationAssociationAccess() {
		return pNavigationAssociation;
	}
	
	public ParserRule getNavigationAssociationRule() {
		return getNavigationAssociationAccess().getRule();
	}
	
	//NavigationAlias:
	//	ID;
	public NavigationAliasElements getNavigationAliasAccess() {
		return pNavigationAlias;
	}
	
	public ParserRule getNavigationAliasRule() {
		return getNavigationAliasAccess().getRule();
	}
	
	//CreateEvent:
	//	'create' 'events' '(' 'before' ID '.xsjs' ':' ID '.xsjslib' '::' ID ')';
	public CreateEventElements getCreateEventAccess() {
		return pCreateEvent;
	}
	
	public ParserRule getCreateEventRule() {
		return getCreateEventAccess().getRule();
	}
	
	//DeleteUsing:
	//	'delete' 'using' ID '.xsjs' ':' ID '.xsjslib' '::' ID;
	public DeleteUsingElements getDeleteUsingAccess() {
		return pDeleteUsing;
	}
	
	public ParserRule getDeleteUsingRule() {
		return getDeleteUsingAccess().getRule();
	}
	
	//Update:
	//	'update' 'forbidden';
	public UpdateElements getUpdateAccess() {
		return pUpdate;
	}
	
	public ParserRule getUpdateRule() {
		return getUpdateAccess().getRule();
	}
	
	//Association:
	//	'association' name=ID 'principal' principal=AssociationPrincipal '(' principalKey=AssociationPrincipalKey ')'
	//	'multiplicity' principalMultiplicity=MultiplicityType 'dependent' dependent=AssociationDependent '('
	//	dependentProperty=AssociationDependentProperty ')' 'multiplicity' dependentMultiplicity=MultiplicityType ';';
	public AssociationElements getAssociationAccess() {
		return pAssociation;
	}
	
	public ParserRule getAssociationRule() {
		return getAssociationAccess().getRule();
	}
	
	//AssociationPrincipal:
	//	ID;
	public AssociationPrincipalElements getAssociationPrincipalAccess() {
		return pAssociationPrincipal;
	}
	
	public ParserRule getAssociationPrincipalRule() {
		return getAssociationPrincipalAccess().getRule();
	}
	
	//AssociationPrincipalKey:
	//	ID;
	public AssociationPrincipalKeyElements getAssociationPrincipalKeyAccess() {
		return pAssociationPrincipalKey;
	}
	
	public ParserRule getAssociationPrincipalKeyRule() {
		return getAssociationPrincipalKeyAccess().getRule();
	}
	
	//AssociationDependent:
	//	ID;
	public AssociationDependentElements getAssociationDependentAccess() {
		return pAssociationDependent;
	}
	
	public ParserRule getAssociationDependentRule() {
		return getAssociationDependentAccess().getRule();
	}
	
	//AssociationDependentProperty:
	//	ID;
	public AssociationDependentPropertyElements getAssociationDependentPropertyAccess() {
		return pAssociationDependentProperty;
	}
	
	public ParserRule getAssociationDependentPropertyRule() {
		return getAssociationDependentPropertyAccess().getRule();
	}
	
	//MultiplicityType:
	//	'*' | '1';
	public MultiplicityTypeElements getMultiplicityTypeAccess() {
		return pMultiplicityType;
	}
	
	public ParserRule getMultiplicityTypeRule() {
		return getMultiplicityTypeAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
