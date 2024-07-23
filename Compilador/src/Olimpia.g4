grammar Olimpia;

inicio: algoritmo EOF;
algoritmo: (instrucao)*;
instrucao: declaracao|atribuicao|acao|controle|repeticao|funcao|limbo;
declaracao: PEGASO DIO| PEGASO DIO LOG (DIO|HERMES| operacao);
atribuicao: DIO LOG (DIO|HERMES| operacao);
acao: ECO(DIO|HERMES|operacao)|PROF DIO;
operacao: operando operacao_calda;
operando: DIO|HERMES;
operacao_calda: HEFESTO operando (operacao_calda)*;
controle: ERI HEC cond ATE JA (instrucao)* NUS (senao)?;
senao: HAR JA (instrucao)* NUS;
cond: operando AFRODITE operando (booleano)*;
booleano: TEMIS HEC cond ATE;
repeticao: SIS HEC cond ATE JA (instrucao)*  NUS;
funcao: PEGASO DIO HEC (declaracao)* ATE JA (instrucao)* ELY (DIO|HERMES) NUS;
limbo: CAO DIO HEC (declaracao)* ATE JA (instrucao)* NUS;

PEGASO: 'medusa'|'poseidon'|'atena';
HEC:'(';
ATE:')';
JA:'{';
NUS:'}';
CAO: 'caos';
ECO: 'eco';
PROF: 'profecia';

SIS: 'sisifo';

ERI: 'eris';
HAR: 'harmonia';

LOG: 'logos';
HEFESTO: '+'|'-'|'*'|'/';


TEMIS: 'nemesis'|'eros';
AFRODITE: '<'|'>'|'>='|'<='|'='|'!=';
ELY: 'elysium';

fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
DIO: LETRA(DIGITO|LETRA)*;
HERMES: DIGITO+('.'DIGITO+)?;
APORIA: [ \r\t\n]* ->skip;
ErrorChar: . ;
