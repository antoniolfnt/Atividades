a = int(input('Digite a nota do primeiro bimestre: '))
while a > 10:
        a = int(input('!ERRO! Digite a nota corretamente: '))
b = int(input('Digite a nota do Segundo Bimestre: '))
while b > 10:
    b = int (input('!ERRO! Digite a nota novamente: '))
c = int (input('Terceiro Bimestre: '))
while c > 10:
    c = int(input('!ERRO! Digite a nota novamente:'))
d = int(input('Digite a nota do Quarto Bimestre: '))
while d > 10:
    d = int(input('!Erro! Digite a nota novamente:'))
media = (a + b + c + d) /4
if media >= 7:
    print (f'Aluno aprovado com média, {media}')
else:
    print (f'Aluno reprovado com média, {media}')
