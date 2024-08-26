grammar Olimpia;

inicio: algoritmo EOF #OInicio;
algoritmo: (instrucao)+ #OAlgoritmo;
instrucao: declaracao #OInstrucao|atribuicao #OInstrucao|acao #OInstrucao|controle #OInstrucao|repeticao #OInstrucao|funcao #OInstrucao|limbo #OInstrucao;
declaracao: PEGASO DIO #ODeclaracao;
atribuicao: (declaracao|DIO) LOG (DIO|HERMES|HELIOS|HESTIA| operacao) #OAtribuicao;
acao: ECO(DIO|HERMES|HELIOS|HESTIA|operacao) #OAcao|PROF DIO #OAcao;
operacao: operando operacao_calda #OOperacao;
operando: DIO|HERMES|HELIOS|HESTIA #OOperando;
operacao_calda: HEFESTO operando (operacao_calda)* #OOperacao_calda;
controle: se (senao)? #OControle;
se: ERI HEC cond ATE JA (instrucao)* NUS #OSe;
senao: HAR JA (instrucao)* NUS #OSenao;
cond: operando AFRODITE operando (booleano)* #OCond;
booleano: TEMIS HEC cond ATE #OBooleano;
repeticao: SIS HEC cond ATE JA (instrucao)*  NUS #ORepeticao;
funcao: PEGASO DIO HEC (declaracao)* ATE JA (instrucao)* ELY (DIO|HERMES|HELIOS|HESTIA) NUS #OFuncao;
limbo: CAO DIO HEC (declaracao)* ATE JA (instrucao)* NUS #OLimbo;

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
HERMES: DIGITO+;
HELIOS: DIGITO+'.'DIGITO+;
HESTIA: '"' (LETRA | DIGITO | ' ' | '\\' .)* '"';
APORIA: [ \r\t\n]* ->skip;
ErrorChar: . ;
