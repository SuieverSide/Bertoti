def teste(x):
    x = 6
    if x == 0 or x == 1:
        return x
    else:
        return teste(x - 1)* x + teste(x - 2)
total = 