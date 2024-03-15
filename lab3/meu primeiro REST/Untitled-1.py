def potencia(x,y):
    if y == 0:
        return 1
    else: 
        return x * potencia(x,y - 1)

x = 4
y = 2
total = potencia(x,y)
print(f"{total}")      

