SELECT
    venda_id,
    valor_bruto,
    desconto
FROM dataqa.renner.bronze_vendas
WHERE desconto > valor_bruto;