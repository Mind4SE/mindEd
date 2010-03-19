lexer grammar InternalFractalIdt;
@header {
package org.ow2.fractal.mind.idl.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T12 : 'struct' ;
T13 : 'union' ;
T14 : 'const' ;
T15 : 'volatile' ;
T16 : 'void' ;
T17 : 'char' ;
T18 : 'short' ;
T19 : 'int' ;
T20 : 'long' ;
T21 : 'float' ;
T22 : 'double' ;
T23 : 'signed' ;
T24 : 'unsigned' ;
T25 : 'string' ;
T26 : 'int8_t' ;
T27 : 'uint8_t' ;
T28 : 'int16_t' ;
T29 : 'uint16_t' ;
T30 : 'int32_t' ;
T31 : 'uint32_t' ;
T32 : 'int64_t' ;
T33 : 'uint64_t' ;
T34 : 'intptr_t' ;
T35 : 'uintptr_t' ;
T36 : 'in' ;
T37 : 'out' ;
T38 : '#ifndef' ;
T39 : '#endif' ;
T40 : ';' ;
T41 : 'typedef' ;
T42 : '{' ;
T43 : '}' ;
T44 : ':' ;
T45 : 'enum' ;
T46 : ',' ;
T47 : '=' ;
T48 : '*' ;
T49 : '(' ;
T50 : ')' ;
T51 : '[' ;
T52 : ']' ;
T53 : '.' ;
T54 : '#define' ;
T55 : 'interface' ;
T56 : 'unmanaged' ;
T57 : '...' ;
T58 : '#include' ;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 4432
RULE_INCLUDELIB : '<' RULE_ID '.' RULE_ID '>';

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 4434
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 4436
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 4438
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 4440
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 4442
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 4444
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 4446
RULE_ANY_OTHER : .;

