SELECT b.venda_id
FROM dataqa.renner.bronze_vendas b
         LEFT JOIN dataqa.renner.silver_vendas s
                   ON b.venda_id = s.venda_id
WHERE b.produto_id IS NOT NULL
  AND b.quantidade > 0
  AND b.valor_unitario >= 0
  AND b.status IN ('FATURADO', 'CANCELADO')
  AND b.data_venda IS NOT NULL
  AND b.desconto <= b.valor_bruto
  AND s.venda_id IS NULL;