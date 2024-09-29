## Tratamento de Exceções

Uma exceção é um evento que ocorre em um programa quando seu fluxo normal de instruções é rompido.  
  
O primeiro passo para tratar as exceções é enclausurar o código que pode causar uma exception dentro do bloco try.
Logo após, são definidos os blocos catch, que devem tratar as exceções. Cada bloco catch deve conter as instruções que serão executadas quando ocorrer a exceção de seu argumento.
O bloco finally sempre é executado quando o bloco try finaliza. É nele que o código irá fechar conexões, arquivos e liberar recursos utilizados dentro do bloco try/catch mesmo que ocorram exceções.
