#include "fila.h"
#include <stdio.h>
#include <stdlib.h>

#define TAM_FILA 3

int fila[TAM_FILA], ultimaPosicao = 0;

int main(void)
{

    enfileirar(1);
    enfileirar(2);
    enfileirar(3);
    desenfileirar();
    enfileirar(3);
    enfileirar(3);

    exibir();

    return 0;
}
void enfileirar(int valor)
{
    if (cheia() == 0) {
        fila[ultimaPosicao] = valor;
        ultimaPosicao++;
    } else {
        printf("Não foi possivel enfileirar item. Lista cheia!");
    }
}

int desenfileirar()
{
    int valor;
    if (vazia() == 0) {
        ultimaPosicao--;
        valor = fila[ultimaPosicao];
        fila[ultimaPosicao] = 0;
        return valor;
    } else {
        printf("Não foi possivel desenfileirar item. Lista vazia!");
    }
}

int vazia()
{
    int resultado = 1;

    for (int i = 0; i < TAM_FILA; i++) {
        if (fila[i] != NULL) {
            resultado = 0;
        }
    }
    return resultado;
}

int cheia()
{
    int resultado = 1;

    for (int i = 0; i < TAM_FILA; i++) {
        if (fila[i] == NULL) {
            resultado = 0;
        }
    }
    return resultado;
}

void exibir()
{

    for (int i = 0; i < TAM_FILA; i++) {
        printf("%i\n", fila[i]);
    }
}