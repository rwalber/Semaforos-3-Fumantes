# Semáforos 3 Fumantes

Três fumantes se encontram em uma sala com um vendedor de suprimentos para
fumantes. Para preparar e usar um cigarro, cada fumante precisa de três ingredientes:
tabaco, papel e fósforo, coisas que o vendedor tem à vontade no estoque. Um fumante
tem o seu próprio tabaco, o segundo tem seu próprio papel, e o outro tem seu próprio
fósforo. A ação se inicia quando o vendedor coloca à venda dois ingredientes na mesa,
de forma a permitir que um dos fumantes execute esta prática dita como não muito
saudável. Quando o tal fumante termina, ele acorda o vendedor, que escolhe então
outros dois ingredientes (aleatoriamente) e coloca a venda, portanto desbloqueando
outro fumante.

Exemplo de saída:

Produtos a venda: [Tabaco, Fósforo]
Produtos a venda: [Tabaco, Fósforo]
Produtos a venda: [Tabaco, Fósforo]
Fumante 2 possui: [Tabaco]
Fumante 2 está com o vendedor, agora possui: [Tabaco, Fósforo]
  
Produtos a venda: [Papel, Tabaco]
Fumante 3 possui: [Papel]
Fumante 3 está com o vendedor, agora possui: [Papel, Tabaco]
  
Produtos a venda: [Fósforo, Tabaco]
Fumante 1 possui: [Fósforo]
Fumante 1 está com o vendedor, agora possui: [Fósforo, Tabaco]
  
Produtos a venda: [Papel, Tabaco]
Fumante 2 possui: [Tabaco, Fósforo]
Fumante 2 está com o vendedor, agora possui: [Tabaco, Fósforo, Papel]
  
Fumante: 2 Completou o cigarro, já pode fumar..
  
Fumante: 2 Terminou de fumar, encerrando..
  
Fumante 3 possui: [Papel, Tabaco]
Fumante 3 está com o vendedor, agora possui: [Papel, Tabaco, Fósforo]
  
Fumante: 3 Completou o cigarro, já pode fumar..
  
Fumante: 3 Terminou de fumar, encerrando..
  
Fumante 1 possui: [Fósforo, Tabaco]
Fumante 1 está com o vendedor, agora possui: [Fósforo, Tabaco, Papel]
  
Fumante: 1 Completou o cigarro, já pode fumar..
  
Fumante: 1 Terminou de fumar, encerrando..
  
CONSTRUÍDO COM SUCESSO (tempo total: 9 segundos)
