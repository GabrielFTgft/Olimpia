grammar Olimpia;

PEGASO: 'medusa'|'poseidon';
ATEN: 'atena';
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
