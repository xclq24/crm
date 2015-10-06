package com.tarena.db;

public class PageUtil {
	public static Page createPage(int everyPage, int totalCount, int currentPage){
		everyPage = getEveryPage(everyPage);
		currentPage = getCurrentPage(currentPage);
		int totalPage = getTotalPage(everyPage, totalCount);
		int beginIndex = getBeginIndex(everyPage, currentPage);
		boolean hasPrePage = getHasPrePage(currentPage);
		boolean hasNextPage = getHasNextPage(totalPage,currentPage);
		
		return new Page(everyPage, totalCount, totalPage, currentPage, beginIndex, hasPrePage, hasNextPage);
	}

	private static int getEveryPage(int everyPage) {
		return everyPage == 0 ? 10:everyPage;
	}
	
	private static int getCurrentPage(int currentPage) {
		return currentPage == 0? 1:currentPage;
	}
	
	private static int getTotalPage(int everyPage, int totalCount) {
		int totalPage = 0;
		if(totalCount != 0 && totalCount%everyPage == 0){
			totalPage =  totalCount/everyPage;
		}else{
			totalPage = totalCount/everyPage + 1; 
		}
		return totalPage;
	}
	
	private static int getBeginIndex(int everyPage, int currentPage) {
		return (currentPage-1) * everyPage;
	}

	private static boolean getHasPrePage(int currentPage) {
		return currentPage == 1? false:true;
	}

	private static boolean getHasNextPage(int totalPage, int currentPage) {
		return currentPage == totalPage || totalPage == 0 ? false:true;
	}
}
