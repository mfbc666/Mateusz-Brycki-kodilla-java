package com.kodilla.good.patterns.challenges.excerciseNineTwo;

public class ProductOrderService {

    private InformationService informationService;
    private OrderRepository orderRepository;
    private OrderService orderService;

    public ProductOrderService(final InformationService informationService,
                               final OrderRepository orderRepository,
                               final OrderService orderService) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;

    }

    public OrderDTO process(OrderRequest orderRequest) {
        boolean isOrdered = orderService.createProductOrder(orderRequest.getUser()
                , orderRequest.getProductName(), orderRequest.getProductQuantity());

        if (isOrdered) {
            informationService.sendEmail(orderRequest.getUser());
            orderRepository.newOrder(orderRequest.getUser(), orderRequest.getProductName(), orderRequest.productQuantity);

            return new OrderDTO(orderRequest.getUser(), true);
        } else {
            return new OrderDTO(orderRequest.getUser(), false);


        }

    }
}
