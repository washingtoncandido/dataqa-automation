SELECT
    venda_id,
    quantidade,
    valor_unitario,
    desconto,
    valor_liquido_esperado,
    (quantidade * valor_unitario - desconto) AS valor_liquido_calculado
FROM dataqa.renner.bronze_vendas
WHERE ABS(
              valor_liquido_esperado - (quantidade * valor_unitario - desconto)
      ) > 0.01;